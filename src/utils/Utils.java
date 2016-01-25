package utils;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;
import operations.ArithmeticalOperator;
import operations.arguments.Argument;
import operations.arguments.ArithmeticalArgument;
import operations.arguments.FunCallArgument;
import operations.arguments.ListArgument;
import operations.arguments.ListElementInIndexArgument;
import operations.arguments.NumberArgument;
import operations.arguments.VariableArgument;
import parserAndLexer.ListLanguageParser.Arithmetic_operationContext;
import parserAndLexer.ListLanguageParser.Function_callContext;
import parserAndLexer.ListLanguageParser.ListContext;
import parserAndLexer.ListLanguageParser.ValueContext;

public class Utils {

	public static Element<?> calcArgument(Argument arg,Executor exec,int line)
	{
		Element<?> elem = null;
		if(arg instanceof FunCallArgument)
		{
			elem = exec.callOuterFunction((FunCallArgument)arg,line);
		}
		else if(arg instanceof ArithmeticalArgument)
		{
			ArithmeticalArgument aa = (ArithmeticalArgument) arg;
			elem = exec.callArithmeticalOperation(aa.getArgs().get(0), aa.getArgs().get(1), aa.getOperator(),line);
		}
		else if(arg instanceof ListArgument)
		{
			elem = new ListElement(((ListArgument) arg).getContent(),line);
		}
		else if(arg instanceof ListElementInIndexArgument)
		{
			elem  = new NumberElement(exec.getIntegerFromListIndex(((ListElementInIndexArgument) arg).getId(), ((ListElementInIndexArgument) arg).getIndex(),line),line);
		}
		else if(arg instanceof NumberArgument)
		{
			elem  = new NumberElement(((NumberArgument) arg).getNumber(),line);
		}
		else if(arg instanceof VariableArgument)
		{
			elem = exec.getVar(((VariableArgument) arg).getVarId(),line);
		}

		return elem;
	}
	
	public static Argument getArgument(ParseTree parseTree,int line)
	{
		
		if(parseTree instanceof ListContext)
		{
			ListContext l = (ListContext) parseTree;
			ArrayList<Integer> list = new ArrayList<>();
			for(int  i = 0 ; i<l.NUMBER().size() ; i++)
			{
				list.add(Integer.parseInt(l.NUMBER(i).toString()));
			}
			
			return new ListArgument(list,line);
			
		}
		else if(parseTree instanceof ValueContext)
		{
			ValueContext vc = (ValueContext) parseTree;
			if(vc.NUMBER() != null)
			{
				return new NumberArgument(Integer.parseInt(vc.NUMBER().toString()),line);
			}
			else
			{
				return new ListElementInIndexArgument(vc.list_element().ID().toString(),Integer.parseInt(vc.list_element().NUMBER().toString()),line);
				
			}
		}
		else if (parseTree instanceof Function_callContext){
			
			Function_callContext fc = (Function_callContext) parseTree;
			FunCallArgument fca = new FunCallArgument(fc.ID().toString(),line);
			for(int i = 0  ; i < fc.function_call_arg().size() ; i++)
			{
				Argument arg = Utils.getArgument(fc.function_call_arg(i).getChild(0),line);
				fca.getArgs().add(arg);
			}
			return fca;
		}
		else if(parseTree instanceof Arithmetic_operationContext)
		{
			Arithmetic_operationContext ao = (Arithmetic_operationContext) parseTree;
			ArithmeticalArgument aa = new ArithmeticalArgument(line);
			Argument left = Utils.getArgument(ao.children.get(0),line);
			Argument right = Utils.getArgument(ao.children.get(2),line);
			aa.getArgs().add(left);
			aa.getArgs().add(right);
			aa.setOperator(ArithmeticalOperator.fromString(ao.ACTION_OPERATOR().toString()));
			return aa;
		}
		if(parseTree instanceof TerminalNode)
		{
			String id = parseTree.toString();
			return new VariableArgument(id,line);
		}
		else throw new RuntimeException("Niepoprawny argument. LINIA: "+line);
	}
	public static Argument getFunCallArgument(Function_callContext ctx)
	{
		return null;
		
	}
}
