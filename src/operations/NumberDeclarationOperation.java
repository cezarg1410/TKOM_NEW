package operations;

import elements.NumberElement;
import execution.Executor;

public class NumberDeclarationOperation extends Operation{

	Integer var;
	
	public NumberDeclarationOperation(String id, Integer var)
	{
		this.id =id;
		this.var = var;
		
	}

	@Override
	public void perform(Executor exec) {
		
		NumberElement l = new NumberElement(var);
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
