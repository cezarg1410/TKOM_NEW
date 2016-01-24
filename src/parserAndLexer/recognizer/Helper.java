package parserAndLexer.recognizer;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;
import operations.ArithmeticalOperation;
import operations.ArithmeticalOperator;
import operations.AssignmentOperation;
import operations.ElementaryCondition;
import operations.FunctionCall;
import operations.IFOperation;
import operations.ListDeclarationOperation;
import operations.LogicalOperator;
import operations.LoopOperation;
import operations.NumberDeclarationOperation;
import operations.Operation;
import operations.ReturnOperation;
import operations.arguments.Argument;
import operations.arguments.ArithmeticalArgument;
import operations.arguments.FunCallArgument;
import operations.arguments.VariableArgument;
import parserAndLexer.ListLanguageLexer;
import parserAndLexer.ListLanguageParser.Arithmetic_operationContext;
import parserAndLexer.ListLanguageParser.AssignmentContext;
import parserAndLexer.ListLanguageParser.Elementary_conditionContext;
import parserAndLexer.ListLanguageParser.Function_callContext;
import parserAndLexer.ListLanguageParser.Function_defContext;
import parserAndLexer.ListLanguageParser.If_statementContext;
import parserAndLexer.ListLanguageParser.List_var_decContext;
import parserAndLexer.ListLanguageParser.LoopContext;
import parserAndLexer.ListLanguageParser.Numerical_var_decContext;
import parserAndLexer.ListLanguageParser.OperationContext;
import parserAndLexer.ListLanguageParser.Return_opContext;
import utils.Utils;

public class Helper {
	
	Executor exec;
	

	public Helper(Executor exec) {
		this.exec = exec;
	}

	public void visitAssignment(AssignmentContext ctx, List<Operation> container)
	{
		String id = ctx.ID(0).toString();
		if(ctx.list() != null)
		{
			ArrayList<Integer> content = new ArrayList<>();
			for(int i = 0 ; i<ctx.list().NUMBER().size(); i++)
			{
				content.add(Integer.parseInt(ctx.list().NUMBER(i).toString()));
			}
			container.add(new AssignmentOperation(id,new ListElement(content)));
		}
		else if (ctx.list_element() != null)
		{
			Integer val = getListElement(ctx.list_element().ID().toString(), ctx.list_element().NUMBER().toString(),container);
			container.add(new AssignmentOperation(id,new NumberElement(val)));
		}
		else if(ctx.NUMBER() != null)
		{
			Integer val = Integer.parseInt(ctx.NUMBER().toString());
			container.add(new AssignmentOperation(id,new NumberElement(val)));
		}
		else if(ctx.ID().size() > 0 && ctx.ID().get(1) != null) 
		{
			VariableArgument va = new VariableArgument(ctx.ID(0).toString());
			container.add(new AssignmentOperation(id,va));
		}
		
		else if(ctx.function_call() != null)
		{
			FunCallArgument fc = new FunCallArgument(ctx.function_call().ID().toString());
			for (int i = 0 ; i < ctx.function_call().function_call_arg().size() ; i++)
			{
				Argument arg = Utils.getArgument(ctx.function_call().function_call_arg(i));
				fc.getArgs().add(arg);
			}
			container.add(new AssignmentOperation(id, fc));
		}
	}
	
	public void visitNumericalVarDec(Numerical_var_decContext ctx, List<Operation> container)
	{
		String id = ctx.ID().toString();
		Integer val = null;
		if(ctx.NUMBER() != null)
		{
			val = Integer.parseInt(ctx.NUMBER().toString());
		}
		else if(ctx.list_element() != null)
		{
			val = getListElement(ctx.list_element().ID().toString(),ctx.list_element().NUMBER().toString(),container);	
		}
		else if(ctx.function_call() != null)
		{
			FunCallArgument fc = (FunCallArgument) Utils.getArgument(ctx.function_call());
//			for( int  i = 0 ; i<ctx.function_call().function_call_arg().size() ; i++)
//			{
//				Argument arg = Utils.getArgument(ctx.function_call().function_call_arg(i).children.get(0));
//				fc.getArgs().add(arg);
//			}
			container.add(new NumberDeclarationOperation(id,fc));
			return;
			
		}
		else if(ctx.arithmetic_operation() != null)
		{
			//ArithmeticalOperation ao = new ArithmeticalOperation();
			ArithmeticalArgument aa = new ArithmeticalArgument();
			aa.getArgs().add(Utils.getArgument(ctx.arithmetic_operation().getChild(0)));
			aa.getArgs().add(Utils.getArgument(ctx.arithmetic_operation().getChild(2)));
			aa.setOperator(ArithmeticalOperator.fromString(ctx.arithmetic_operation().getChild(1).toString()));
			container.add(new NumberDeclarationOperation(id,aa));
			return;
		}
		container.add(new NumberDeclarationOperation(id,val));
	}
	
	


	private Integer getListElement(String id, String number, List<Operation> container) {
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
	
	public void visitListVarDec(List_var_decContext ctx, List<Operation> container)
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
			FunCallArgument fc = (FunCallArgument) Utils.getArgument(ctx.function_call());
//			for( int  i = 0 ; i<ctx.function_call().function_call_arg().size() ; i++)
//			{
//				Argument arg = Utils.getArgument(ctx.function_call().function_call_arg(i).children.get(0));
//				fc.getArgs().add(arg);
//			}
			container.add(new ListDeclarationOperation(id,fc));
			return;
		}
		container.add(new ListDeclarationOperation(id,content));
	}
	
	public void evalIfStatemntOperation(OperationContext op, List<Operation> container)
	{
		createAndGetOperation(op,container);
	}
	

	public void visitIfStatement(If_statementContext ctx, List<Operation> container) {
		IFOperation oper = new IFOperation();
		for(Elementary_conditionContext ct : ctx.condition().elementary_condition())
		{
			Argument firstArg = Utils.getArgument(ct.children.get(0));
			Argument secondArg = Utils.getArgument(ct.children.get(2));

			LogicalOperator lo = LogicalOperator.fromString(ct.children.get(1).toString());
			ElementaryCondition ec = new ElementaryCondition(firstArg,lo,secondArg); 
			oper.getConditions().add(ec);
		}
		String and = ListLanguageLexer.VOCABULARY.getLiteralName(26).toString().substring(1, 3);
		String or = ListLanguageLexer.VOCABULARY.getLiteralName(27).toString().substring(1, 4);
		for(ParseTree t :ctx.condition().children)
		{
			if(t instanceof TerminalNode ){
				if(t.toString().equals(and) || t.toString().equals(or))
				{
					oper.getOperators().add(LogicalOperator.fromString(t.toString()));
				}
			}
		}
		evalIfStatementOperations(ctx,oper,container);
		
		container.add(oper);	
		
	}
	

	public void evalIfStatementOperations(If_statementContext ctx, IFOperation oper, List<Operation> container)
	{
		for(OperationContext op : ctx.then_block().operation())
		{
			evalIfStatemntOperation(op,oper.getThenOperations());
			//oper.getThenOperations().add(evalIfStatemntOperation(op,container));
		}
		if(ctx.else_block() != null)
		{
			for(OperationContext op : ctx.else_block().operation())
			{
				evalIfStatemntOperation(op, oper.getElseOperations());
				//oper.getElseOperations().add(evalIfStatemntOperation(op,container));
			}
		}
		
	}

	public void createFunctionDefinition(Function_defContext ctx, List<Operation> container) {
		
		FunctionDefinition fc = new FunctionDefinition();
		String id = ctx.ID().toString();
		for(int i = 0 ; i < ctx.function_def_arg().size() ; i++)
		{
			fc.getArgs().add(ctx.function_def_arg(i).ID().toString());
		}
		for(int i = 0 ; i<ctx.operation().size() ; i++)
		{
			createAndGetOperation(ctx.operation(i),fc.getOperations());
		}
		exec.getFunctions().put(id, fc);
		
	}
	
	
	
	public void createAndGetOperation(OperationContext ctx, List<Operation> container)
	{
		if(ctx.list_var_dec() != null)
		{
			visitListVarDec(ctx.list_var_dec(),container);
		}
		else if(ctx.numerical_var_dec() != null)
		{
			visitNumericalVarDec(ctx.numerical_var_dec(), container);
		}
		else if(ctx.if_statement() != null)
		{
			visitIfStatement(ctx.if_statement(), container);
		}
		else if(ctx.loop() != null)
		{
			visitLoop(ctx.loop(), container);
		}
		else if(ctx.return_op() != null)
		{
			visitReturn(ctx.return_op(),container);
		}
		else if(ctx.function_call() != null)
		{
			visitFunctionCall(ctx.function_call(), container);
		}
		else if(ctx.arithmetic_operation() != null)
		{
			visitArithmeticOperation(ctx.arithmetic_operation(),container);
		}
		else
			throw new RuntimeException();
		
	}

	@SuppressWarnings("unused")
	private void visitArithmeticOperation(Arithmetic_operationContext ctx, List<Operation> container) {
		ArithmeticalOperation ao = new ArithmeticalOperation();
		Argument left = Utils.getArgument(ctx.getChild(0));
		Argument right = Utils.getArgument(ctx.getChild(2));
		ArithmeticalOperator op = ArithmeticalOperator.fromString(ctx.getChild(1).toString());
		
	}

	private void visitReturn(Return_opContext return_op, List<Operation> container) {
		ReturnOperation ro = new ReturnOperation();
		Argument arg = Utils.getArgument(return_op.return_arg().getChild(0));
		ro.setRetArg(arg);
		container.add(ro);
	}

	public void visitFunctionCall(Function_callContext ctx, List<Operation> container) {
		String id = ctx.ID().toString();
		FunctionDefinition fd = exec.getFunctions().get(id);
		FunctionCall fc = new FunctionCall(fd,id);
		fc.setId(id);
		for(int i = 0 ; i < ctx.function_call_arg().size() ; i++)
		{
			fc.getArgs().add(Utils.getArgument(ctx.function_call_arg(i).children.get(0)));
		}
		
		
//		for(int i = 0 ; i < ctx.function_call_arg().size() ; i++)
//		{
//			args.add(ctx.function_call_arg(i).ID().toString());
//		}
//		for(int i = 0 ; i < ctx.function_call_arg().size() ; i++)
//		{
//			fc.getArgs().add(Utils.getArgument(ctx.function_call_arg(i)));
//		}
//		
		
		container.add(fc);
 	}

	public void visitLoop(LoopContext ctx, List<Operation> operations) {
		Argument arg = Utils.getArgument(ctx.value());
		LoopOperation lo = new LoopOperation(arg);
		
		for(int i = 0 ; i < ctx.operation().size() ; i++)
		{
			createAndGetOperation(ctx.operation(i),lo.getOperations());
		}
		
		
	}
	
	

	
}
