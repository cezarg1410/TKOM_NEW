package operations;

import elements.NumberElement;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.FunCallArgument;

public class NumberDeclarationOperation extends Operation{

	Integer var = null;
	Argument arg;
	
	public NumberDeclarationOperation(String id, Integer var)
	{
		this.id =id;
		this.var = var;
		
	}
	
	public NumberDeclarationOperation(String id, Argument arg)
	{
		this.id = id;
		this.arg = arg;
	}

	@Override
	public void perform(Executor exec) {
		
		if(var == null)
		{			
			var = (Integer)exec.callOuterFunction((FunCallArgument)arg).getContent();
		}
		
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
