package utils;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.FunCallArgument;
import operations.arguments.ListArgument;
import operations.arguments.ListElementInIndexArgument;
import operations.arguments.NumberArgument;
import operations.arguments.VariableArgument;
import parserAndLexer.ListLanguageParser.Function_callContext;
import parserAndLexer.ListLanguageParser.ListContext;
import parserAndLexer.ListLanguageParser.ValueContext;

public class Utils {

	public static Element<?> calcArgument(Argument arg,Executor exec)
	{
		Element<?> elem = null;
		if(arg instanceof FunCallArgument)
		{
			//TODO fun_call
		}
		else if(arg instanceof ListArgument)
		{
			elem = new ListElement(((ListArgument) arg).getContent());
		}
		else if(arg instanceof ListElementInIndexArgument)
		{
			elem  = new NumberElement(exec.getIntegerFromListIndex(((ListElementInIndexArgument) arg).getId(), ((ListElementInIndexArgument) arg).getIndex()));
		}
		else if(arg instanceof NumberArgument)
		{
			elem  = new NumberElement(((NumberArgument) arg).getNumber());
		}
		else if(arg instanceof VariableArgument)
		{
			elem = exec.getVar(((VariableArgument) arg).getVarId());
		}

		return elem;
	}
	
	public static Argument getArgument(ParseTree parseTree)
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
	public static Argument getFunCallArgument(Function_callContext ctx)
	{
		return null;
		
	}
}
