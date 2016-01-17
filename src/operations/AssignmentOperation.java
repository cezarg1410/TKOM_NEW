package operations;

import elements.Element;
import execution.Executor;

public class AssignmentOperation extends Operation {
	
	Element<?> var;
	
	public AssignmentOperation(String id,Element<?> var)
	{
		this.id = id;
		this.var = var;
	}

	@Override
	public void perform(Executor exec) {
		
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
