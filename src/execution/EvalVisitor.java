package execution;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr_classes.ListLanguageBaseVisitor;
import antlr_classes.ListLanguageLexer;
import antlr_classes.ListLanguageParser;
import antlr_classes.ListLanguageParser.AssignmentContext;
import antlr_classes.ListLanguageParser.Compilation_unitContext;
import antlr_classes.ListLanguageParser.ConditionContext;
import antlr_classes.ListLanguageParser.Elementary_conditionContext;
import antlr_classes.ListLanguageParser.Function_callContext;
import antlr_classes.ListLanguageParser.Function_defContext;
import antlr_classes.ListLanguageParser.If_statementContext;
import antlr_classes.ListLanguageParser.ListContext;
import antlr_classes.ListLanguageParser.List_elementContext;
import antlr_classes.ListLanguageParser.List_var_decContext;
import antlr_classes.ListLanguageParser.LoopContext;
import antlr_classes.ListLanguageParser.Numerical_var_decContext;
import antlr_classes.ListLanguageParser.OperationContext;
import antlr_classes.ListLanguageParser.ValueContext;
import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import operations.AssignmentOperation;
import operations.ElementaryCondition;
import operations.FunctionCall;
import operations.IFOperation;
import operations.ListDeclarationOperation;
import operations.LogicalOperator;
import operations.NumberDeclarationOperation;
import operations.Operation;
import operations.arguments.Argument;
import operations.arguments.ListArgument;
import operations.arguments.ListElementInIndexArgument;
import operations.arguments.NumberArgument;
import operations.arguments.VariableArgument;

public class EvalVisitor extends ListLanguageBaseVisitor<Integer> {

	public ListLanguageParser parser;
	public Executor exec;
	
	public EvalVisitor(ListLanguageParser parser, Executor exec)
	{
		this.exec = exec;
		this.parser = parser;
		
	}

	boolean shouldAddToOperations(ParseTree ctx)
	{
		boolean res = true;
		while(true)
		{
			if(ctx.getParent() != null)
			{
				if( ctx.getParent() instanceof If_statementContext)
					res = false;
			}
			else
				break;
			ctx = ctx.getParent();
		}
		return res;
	}
	@Override
	public Integer visitAssignment(AssignmentContext ctx)
	{
		if(shouldAddToOperations(ctx))
			mVisitAssignment(ctx);
		return super.visitAssignment(ctx);
	}
	
	public void mVisitAssignment(AssignmentContext ctx)
	{
		String id = ctx.ID().toString();
		if(ctx.list() != null)
		{
			ArrayList<Integer> content = new ArrayList<>();
			for(int i = 0 ; i<ctx.list().NUMBER().size(); i++)
			{
				content.add(Integer.parseInt(ctx.list().NUMBER(i).toString()));
			}
			exec.getOperations().add(new AssignmentOperation(id,new ListElement(content)));
		}
		else if (ctx.list_element() != null)
		{
			Integer val = getListElement(ctx.list_element().ID().toString(), ctx.list_element().NUMBER().toString());
			exec.getOperations().add(new AssignmentOperation(id,new NumberElement(val)));
		}
		else if(ctx.NUMBER() != null)
		{
			Integer val = Integer.parseInt(ctx.NUMBER().toString());
			exec.getOperations().add(new AssignmentOperation(id,new NumberElement(val)));
		}
		else 
		{
			//TODO function_call
		}
	}

	@Override
	public Integer visitNumerical_var_dec(Numerical_var_decContext ctx) {
		if(shouldAddToOperations(ctx))
			mVisitNumericalVarDec(ctx);
		return super.visitNumerical_var_dec(ctx);
	}
	
	public void mVisitNumericalVarDec(Numerical_var_decContext ctx)
	{
		String id = ctx.ID().toString();
		Integer val = null;
		if(ctx.NUMBER() != null)
		{
			val = Integer.parseInt(ctx.NUMBER().toString());
		}
		else if(ctx.list_element() != null)
		{
			val = getListElement(ctx.list_element().ID().toString(),ctx.list_element().NUMBER().toString());	
		}
		else
		{
			//TODO function_call
		}
		exec.getOperations().add(new NumberDeclarationOperation(id,val));
	}

	private Integer getListElement(String id, String number) {
		if(exec.getCalledFunctions().size() == 0)
		{
			ListElement e = (ListElement) exec.getGlobalVariables().get(id);
			if(e == null)
				throw new RuntimeException("Brak listy");
			else
				return e.getContent().get(Integer.parseInt(number));
		}
		else
		{
			FunctionCall fc = exec.getCalledFunctions().getLast();
			ListElement e = (ListElement) fc.getLocalVar(id);
			return e.getContent().get(Integer.parseInt(number));
		}
	}

	@Override
	public Integer visitList_var_dec(List_var_decContext ctx) 
	{
		if(shouldAddToOperations(ctx))
			mVisitListVarDec(ctx);
		return super.visitList_var_dec(ctx);
	}

	public void mVisitListVarDec(List_var_decContext ctx)
	{
		String id = ctx.ID().toString(); 
		ArrayList<Integer> content = new ArrayList<>();
		if(ctx.list() != null)
		{
			for(int i = 0 ; i<ctx.list().NUMBER().size(); i++)
			{
				content.add(Integer.parseInt(ctx.list().NUMBER(i).toString()));
			}		
		}
		else
		{
			//TODO function_CALL
		}
		exec.getOperations().add(new ListDeclarationOperation(id,content));
	}
	
//	@Override
//	public Integer visitList(ListContext ctx) {
//		return super.visitList(ctx);
//	}
//
//	@Override
//	public Integer visitList_element(List_elementContext ctx) {
//		return super.visitList_element(ctx);
//	}
//
//	@Override
//	public Integer visitValue(ValueContext ctx) {
//		return super.visitValue(ctx);
//	}

	@Override
	public Integer visitIf_statement(If_statementContext ctx) {
		if(!shouldAddToOperations(ctx))
			return super.visitIf_statement(ctx);
		IFOperation oper = new IFOperation();
		for(Elementary_conditionContext ct : ctx.condition().elementary_condition())
		{
			Argument firstArg = getArgument(ct.children.get(0));
			Argument secondArg = getArgument(ct.children.get(2));

			LogicalOperator lo = LogicalOperator.fromString(ct.children.get(1).toString());
			ElementaryCondition ec = new ElementaryCondition(firstArg,lo,secondArg); //todo
			oper.getConditions().add(ec);
		}
		String and = ListLanguageLexer.VOCABULARY.getLiteralName(27).toString().substring(1, 3);
		String or = ListLanguageLexer.VOCABULARY.getLiteralName(28).toString().substring(1, 4);
		for(ParseTree t :ctx.condition().children)
		{
			if(t instanceof TerminalNode ){
				if(t.toString().equals(and) || t.toString().equals(or))
				{
					oper.getOperators().add(LogicalOperator.fromString(t.toString()));
				}
			}
		}
		evalIfStatementOperations(ctx,oper);
		
		exec.getOperations().add(oper);	
		
		return super.visitIf_statement(ctx);
	}

	public void evalIfStatementOperations(If_statementContext ctx, IFOperation oper)
	{
		for(OperationContext op : ctx.then_block().operation())
		{
			oper.getThenOperations().add(evalIfStatemntOperation(op));
		}
		for(OperationContext op : ctx.else_block().operation())
		{
			oper.getElseOperations().add(evalIfStatemntOperation(op));
		}
	}
	public Operation evalIfStatemntOperation(OperationContext op)
	{
		if(op.list_var_dec() != null)
		{
			String id = op.list_var_dec().toString(); 
			ArrayList<Integer> content = new ArrayList<>();
			if(op.list_var_dec().list() != null)
			{
				for(int i = 0 ; i<op.list_var_dec().list().NUMBER().size(); i++)
				{
					content.add(Integer.parseInt(op.list_var_dec().list().NUMBER(i).toString()));
				}		
			}
			else
			{
				//TODO function_CALL
			}
			return new ListDeclarationOperation(id,content);
		}
		else if(op.numerical_var_dec() != null)
		{
			String id = op.numerical_var_dec().ID().toString();
			Integer val = null;
			if(op.numerical_var_dec().NUMBER() != null)
			{
				val = Integer.parseInt(op.numerical_var_dec().NUMBER().toString());
			}
			else if(op.numerical_var_dec().list_element() != null)
			{
				val = getListElement(op.numerical_var_dec().list_element().ID().toString(),op.numerical_var_dec().list_element().NUMBER().toString());	
			}
			else
			{
				//TODO function_call
			}
			return new NumberDeclarationOperation(id,val);
		}
		else if(op.assignment() != null)
		{
			String id = op.assignment().ID().toString();
			if(op.assignment().list() != null)
			{
				ArrayList<Integer> content = new ArrayList<>();
				for(int i = 0 ; i<op.assignment().list().NUMBER().size(); i++)
				{
					content.add(Integer.parseInt(op.assignment().list().NUMBER(i).toString()));
				}
				return new AssignmentOperation(id,new ListElement(content));
			}
			else if (op.assignment().list_element() != null)
			{
				Integer val = getListElement(op.assignment().list_element().ID().toString(), op.assignment().list_element().NUMBER().toString());
				return new AssignmentOperation(id,new NumberElement(val));
			}
			else if(op.assignment().NUMBER() != null)
			{
				Integer val = Integer.parseInt(op.assignment().NUMBER().toString());
				return new AssignmentOperation(id,new NumberElement(val));
			}
			else 
			{
				//TODO function_call 
			}
		}
		return null;
	}
	
	
	@Override
	public Integer visitCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondition(ctx);
	}

	@Override
	public Integer visitElementary_condition(Elementary_conditionContext ctx) {

		return super.visitElementary_condition(ctx);
	}

	
	private Argument getArgument(ParseTree parseTree)
	{
		if(parseTree instanceof TerminalNode)
		{
			String id = parseTree.toString();
			return new VariableArgument(id);
		}
		else if(parseTree instanceof ListContext)
		{
			ListContext l = (ListContext) parseTree;
			ArrayList<Integer> list = new ArrayList<>();
			for(int  i = 0 ; i<l.NUMBER().size() ; i++)
			{
				list.add(Integer.parseInt(l.NUMBER(i).toString()));
			}
			
			return new ListArgument(list);
			
		}
		else if(parseTree instanceof ValueContext)
		{
			ValueContext vc = (ValueContext) parseTree;
			if(vc.NUMBER() != null)
			{
				return new NumberArgument(Integer.parseInt(vc.NUMBER().toString()));
			}
			else
			{
				return new ListElementInIndexArgument(vc.list_element().ID().toString(),Integer.parseInt(vc.list_element().NUMBER().toString()));
				
			}
		}
		else {
			return null;
			//TODO function_call
		}
	}

	@Override
	public Integer visitFunction_def(Function_defContext ctx) {

		return super.visitFunction_def(ctx);
	}

	@Override
	public Integer visitFunction_call(Function_callContext ctx) {

		return super.visitFunction_call(ctx);
	}

	@Override
	public Integer visitLoop(LoopContext ctx) {

		return super.visitLoop(ctx);
	}


	@Override
	public Integer visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}
	
	@Override
	public Integer visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

}
