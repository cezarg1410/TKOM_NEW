package operations;

import elements.Element;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class AssignmentOperation extends Operation {
	
	Element<?> var = null;
	Argument arg;
	
	public AssignmentOperation(String id,Element<?> var)
	{
		this.id = id;
		this.var = var;
	}
	
	public AssignmentOperation(String id,Argument arg)
	{
		this.arg = arg;
	}

	@Override
	public void perform(Executor exec) {
		if(var == null)
		{
			var = Utils.calcArgument(arg, exec);
		}
		for(FunctionCall fc : exec.getCalledFunctions())
		{
			Element<?> elem = fc.getLocalVar(id);
			if(elem != null)
			{
				fc.getLocalVariables().put(id, var);
				return;
			}
		}
		Element<?> elem = exec.getGlobalVariables().get(id);
		if(elem == null)
			throw new RuntimeException();
		exec.getGlobalVariables().put(id, var);
		
	}
}
