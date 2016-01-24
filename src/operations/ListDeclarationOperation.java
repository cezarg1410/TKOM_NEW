package operations;

import java.util.ArrayList;

import elements.Element;
import elements.ListElement;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.FunCallArgument;

public class ListDeclarationOperation extends Operation {

	ArrayList<Integer> var;
	Argument arg;
	
	public ListDeclarationOperation(String id, ArrayList<Integer> list)
	{
		this.id =id;
		this.var = list;
		
	}

	public ListDeclarationOperation(String id, Argument arg)
	{
		this.id = id;
		this.arg = arg;
	}

	
	@Override
	public void perform(Executor exec) {
		
		if(var == null)
		{
			FunCallArgument fc = (FunCallArgument) arg;
			Element<?> ret = exec.callOuterFunction(fc);
			if(ret instanceof ListElement)
			{
				ListElement le = (ListElement) ret;
				var = le.getContent();
			}
			
		}
		
		ListElement l = new ListElement(var);
		if(exec.getCalledFunctions().size() == 0)
		{
			exec.getGlobalVariables().put(id, l);
		}
		else
		{
			exec.getCalledFunctions().getFirst().getLocalVariables().put(id, l);
		}
		
	}
}
