package parserAndLexer.recognizer;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import execution.Executor;
import operations.LoopOperation;
import operations.arguments.Argument;
import parserAndLexer.ListLanguageBaseVisitor;
import parserAndLexer.ListLanguageParser;
import parserAndLexer.ListLanguageParser.AssignmentContext;
import parserAndLexer.ListLanguageParser.ConditionContext;
import parserAndLexer.ListLanguageParser.Elementary_conditionContext;
import parserAndLexer.ListLanguageParser.Function_callContext;
import parserAndLexer.ListLanguageParser.Function_defContext;
import parserAndLexer.ListLanguageParser.Function_defsContext;
import parserAndLexer.ListLanguageParser.If_statementContext;
import parserAndLexer.ListLanguageParser.List_var_decContext;
import parserAndLexer.ListLanguageParser.LoopContext;
import parserAndLexer.ListLanguageParser.Numerical_var_decContext;
import utils.Utils;

public class EvalVisitor extends ListLanguageBaseVisitor<Integer> {

	public ListLanguageParser parser;
	public Executor exec;
	public Helper helper;
	
	public EvalVisitor(ListLanguageParser parser, Executor exec,Helper helper)
	{
		this.exec = exec;
		this.parser = parser;
		this.helper = helper;
	}

	boolean shouldAddToOperations(ParseTree ctx)
	{
		boolean res = true;
		while(true)
		{
			if(ctx.getParent() != null)
			{
				if( ctx.getParent() instanceof If_statementContext || ctx.getParent() instanceof Function_defsContext)
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
			helper.visitAssignment(ctx,exec.getOperations());
		return super.visitAssignment(ctx);
	}

	@Override
	public Integer visitNumerical_var_dec(Numerical_var_decContext ctx) {
		if(shouldAddToOperations(ctx))
			helper.visitNumericalVarDec(ctx,exec.getOperations());
		return super.visitNumerical_var_dec(ctx);
	}


	@Override
	public Integer visitList_var_dec(List_var_decContext ctx) 
	{
		if(shouldAddToOperations(ctx))
			helper.visitListVarDec(ctx,exec.getOperations());
		return super.visitList_var_dec(ctx);
	}

	@Override
	public Integer visitIf_statement(If_statementContext ctx) {
		if(shouldAddToOperations(ctx))
			helper.visitIfStatement(ctx,exec.getOperations());
		return super.visitIf_statement(ctx);

	}

	@Override
	public Integer visitFunction_def(Function_defContext ctx) {
		helper.createFunctionDefinition(ctx,exec.getOperations());
		return super.visitFunction_def(ctx);
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
	public Integer visitCondition(ConditionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondition(ctx);
	}

	@Override
	public Integer visitElementary_condition(Elementary_conditionContext ctx) {

		return super.visitElementary_condition(ctx);
	}


	@Override
	public Integer visitFunction_call(Function_callContext ctx) {

		helper.visitFunctionCall(ctx,exec.getOperations());
		return super.visitFunction_call(ctx);
	}

	@Override
	public Integer visitLoop(LoopContext ctx) {
		helper.visitLoop(ctx,exec.getOperations());
		return super.visitLoop(ctx); //TODO
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
