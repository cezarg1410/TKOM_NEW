package operations;

import java.util.ArrayList;
import java.util.HashMap;

import elements.Element;
import elements.FunctionDefinition;
import execution.Executor;

public class FunctionCall extends Operation {

	
	
	private ArrayList<String> args;
	private ArrayList<Element<?>> readyArguments;
	private HashMap<String, Element<?>> localVariables;
	
	public FunctionCall(String id)
	{
		args = new ArrayList<>();
		localVariables = new HashMap<>();
		this.id = id;
	}

	public HashMap<String, Element<?>> getLocalVariables() {
		return localVariables;
	}


	@Override
	public void perform(Executor exec) {
		FunctionDefinition fd = exec.getFunctions().get(id);
		
	}

	public  Element<?> getLocalVar(String id) {
		
		Element<?> res = localVariables.get(id);
		return res;
	}
}
