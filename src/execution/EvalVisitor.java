package execution;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr_classes.ListLanguageBaseVisitor;
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

public class EvalVisitor extends ListLanguageBaseVisitor<Integer> {

	public ListLanguageParser parser;
	public Executor exec;
	
	public EvalVisitor(ListLanguageParser parser, Executor exec)
	{
		this.exec = exec;
		this.parser = parser;
		
	}

	@Override
	public Integer visitAssignment(AssignmentContext ctx)
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
		
		return super.visitAssignment(ctx);
		
	}
	
	@Override
	public Integer visitCompilation_unit(Compilation_unitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCompilation_unit(ctx);
	}

	@Override
	public Integer visitOperation(OperationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOperation(ctx);
	}

	@Override
	public Integer visitNumerical_var_dec(Numerical_var_decContext ctx) {
		
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
		return super.visitNumerical_var_dec(ctx);
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
	public Integer visitList_var_dec(List_var_decContext ctx) {
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
		return super.visitList_var_dec(ctx);
	}

	@Override
	public Integer visitList(ListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitList(ctx);
	}

	@Override
	public Integer visitList_element(List_elementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitList_element(ctx);
	}

	@Override
	public Integer visitValue(ValueContext ctx) {
		// TODO Auto-generated method stub5
		return super.visitValue(ctx);
	}

	@Override
	public Integer visitIf_statement(If_statementContext ctx) {

		IFOperation oper = new IFOperation();
		for(Elementary_conditionContext ct : ctx.condition().elementary_condition())
		{
			Element<?> first = evalArgument(ct.children.get(0));
			Element<?> second = evalArgument(ct.children.get(2));
			LogicalOperator lo = LogicalOperator.fromString(ct.children.get(1).toString());
			ElementaryCondition ec = new ElementaryCondition(first,lo,second);
			oper.getConditions().add(ec);
		}
		
		return super.visitIf_statement(ctx);
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

	private Element<?> evalArgument(ParseTree parseTree) {
		
		if(parseTree instanceof TerminalNode)
		{
			String id = parseTree.toString();
			return exec.getVar(id);
		}
		else if(parseTree instanceof ListContext)
		{
			ListContext l = (ListContext) parseTree;
			ArrayList<Integer> list = new ArrayList<>();
			for(int  i = 0 ; i<l.NUMBER().size() ; i++)
			{
				list.add(Integer.parseInt(l.NUMBER(i).toString()));
			}
			ListElement elem = new ListElement(list);
			return elem;
			
		}
		else if(parseTree instanceof ValueContext)
		{
			ValueContext vc = (ValueContext) parseTree;
			if(vc.NUMBER() != null)
			{
				return new NumberElement(Integer.parseInt(vc.NUMBER().toString()));
			}
			else
			{
				return new NumberElement(exec.getIntegerFromListIndex(vc.list_element().ID().toString(), Integer.parseInt(vc.list_element().NUMBER().toString())));
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
	protected Integer aggregateResult(Integer aggregate, Integer nextResult) {
		// TODO Auto-generated method stub
		return super.aggregateResult(aggregate, nextResult);
	}

	@Override
	protected Integer defaultResult() {
		// TODO Auto-generated method stub
		return super.defaultResult();
	}

	@Override
	protected boolean shouldVisitNextChild(RuleNode node, Integer currentResult) {
		// TODO Auto-generated method stub
		return super.shouldVisitNextChild(node, currentResult);
	}

	@Override
	public Integer visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}

	@Override
	public Integer visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return super.visitChildren(arg0);
	}

	@Override
	public Integer visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		return super.visitErrorNode(node);
	}

	@Override
	public Integer visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		return super.visitTerminal(node);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
//	public FunctionArgument<?> evalCallFuncArgument(Function_call_argContext ctx)
//	{
//		if(ctx.value() != null)
//		{
//			if(ctx.value().NUMBER() != null)
//			{
//				return new IntegerArgument(Integer.parseInt(ctx.value().NUMBER().toString()));
//			}
//			else 
//			{
//				Element<?> elem; 
//				if(currentFunction != null)
//				{
//					elem = currentFunction.getLocalVariables().get(ctx.value().list_element().ID());
//					if(elem == null)
//						elem =  getGlobalVariables().get(ctx.value().list_element().ID());
//				}
//				else
//				{
//					elem =  getGlobalVariables().get(ctx.value().list_element().ID());
//				}
//				if(elem == null)
//					throw new LackOfVariableException(ctx);	
//				ArrayList<Integer> con = (ArrayList<Integer>) elem.getContent();
//				return new IntegerArgument(con.get(Integer.parseInt(ctx.value().list_element().NUMBER().toString())));				
//			}
//			
//		}
//		else
//		{
//			Element<?> elem; 
//			if(currentFunction != null)
//			{
//				elem = currentFunction.getLocalVariables().get(ctx.ID().toString());
//				if(elem == null)
//					elem =  getGlobalVariables().get(ctx.value().list_element().ID());
//			}
//			else
//			{
//				elem =  getGlobalVariables().get(ctx.ID().toString());
//			}
//			if(elem == null)
//				throw new LackOfVariableException(ctx);	
//			if(elem.getContent() instanceof Integer)
//			{
//				return new IntegerArgument((Integer)elem.getContent());
//			}
//			ArrayList<Integer> con = (ArrayList<Integer>) elem.getContent();
//			return new ListArgument(con);
//		}
//
//		
	//}
}
