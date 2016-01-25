package operations;

import elements.Element;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class AssignmentOperation extends Operation {
	
	Element<?> var = null;
	Argument arg;
	
	public AssignmentOperation(String id,Element<?> var,int line)
	{
		this.id = id;
		this.var = var;
		this.line = line;
	}
	
	public AssignmentOperation(String id,Argument arg,int line)
	{
		this.id = id;
		this.arg = arg;
		this.line = line;
	}

	@Override
	public void perform(Executor exec) {
		if(var == null)
		{
			var = Utils.calcArgument(arg, exec, line);
		}
		
		
		if(exec.getCalledFunctions().size() != 0)
		{
			Element<?> elem = exec.getCalledFunctions().getFirst().getLocalVariables().get(id);
			if(elem != null)
			{
				exec.getCalledFunctions().getFirst().getLocalVariables().put(id, var);
				var = null;
				return;
			}
		}
		
//		for(FunctionCall fc : exec.getCalledFunctions())
//		{
//			Element<?> elem = fc.getLocalVar(id);
//			if(elem != null)
//			{
//				fc.getLocalVariables().put(id, var);
//				return;
//			}
//		}
		Element<?> elem = exec.getGlobalVariables().get(id);
		if(elem == null)
			throw new RuntimeException("Brak zmiennej o id: "+id+ "LINIA: "+line);
		exec.getGlobalVariables().put(id, var);
		
	}
}
