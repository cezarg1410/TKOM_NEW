package parserAndLexer.recognizer;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import execution.Executor;
import execution.exceptions.ParsingException;
import parserAndLexer.ListLanguageBaseVisitor;
import parserAndLexer.ListLanguageParser;
import parserAndLexer.ListLanguageParser.AssignmentContext;
import parserAndLexer.ListLanguageParser.Elementary_conditionContext;
import parserAndLexer.ListLanguageParser.Function_callContext;
import parserAndLexer.ListLanguageParser.Function_defContext;
import parserAndLexer.ListLanguageParser.If_statementContext;
import parserAndLexer.ListLanguageParser.List_var_decContext;
import parserAndLexer.ListLanguageParser.LoopContext;
import parserAndLexer.ListLanguageParser.Numerical_var_decContext;
import parserAndLexer.ListLanguageParser.ProgramContext;

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

	public boolean shouldAddToOperations(ParseTree ctx)
	{
		if(ctx.getParent().getParent() instanceof ProgramContext)
		{
			return true;
		}
		return false;
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

	@Override
	public Integer visitElementary_condition(Elementary_conditionContext ctx) {

		return super.visitElementary_condition(ctx);
	}

	@Override
	public Integer visitFunction_call(Function_callContext ctx) {
		if(!shouldAddToOperations(ctx))
			return super.visitFunction_call(ctx);
		if(!(ctx.parent instanceof Numerical_var_decContext))
			helper.visitFunctionCall(ctx,exec.getOperations());
		return super.visitFunction_call(ctx);
	}

	@Override
	public Integer visitLoop(LoopContext ctx) {
		helper.visitLoop(ctx,exec.getOperations());
		return super.visitLoop(ctx);
	}

	@Override
	public Integer visitErrorNode(ErrorNode node) {
		throw new ParsingException(node.toString());
	}
}
