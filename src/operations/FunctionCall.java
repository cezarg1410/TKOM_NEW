package operations;

import java.util.HashMap;

import elements.Element;
import execution.Executor;

public class FunctionCall extends Operation {

	private HashMap<String, Element<?>> localVariables;
	


	public HashMap<String, Element<?>> getLocalVariables() {
		return localVariables;
	}


	@Override
	public void perform(Executor exec) {
		// TODO Auto-generated method stub
		
	}

	public  Element<?> getLocalVar(String id) {
		
		Element<?> res = localVariables.get(id);
		return res;
	}
}
