package operations;

import java.util.ArrayList;

import elements.ListElement;
import execution.Executor;

public class ListDeclarationOperation extends Operation {

	ArrayList<Integer> var;
	
	public ListDeclarationOperation(String id, ArrayList<Integer> list)
	{
		this.id =id;
		this.var = list;
		
	}

	@Override
	public void perform(Executor exec) {
		
		ListElement l = new ListElement(var);
		if(exec.getCalledFunctions().size() == 0)
		{
			exec.getGlobalVariables().put(id, l);
		}
		else
		{
			exec.getCalledFunctions().getLast().getLocalVariables().put(id, l);
		}
		
	}
}
