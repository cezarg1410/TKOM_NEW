package operations;

import java.util.LinkedList;

import execution.Executor;

public abstract class Operation {

	String id;
	
	Operation parent;
	LinkedList <Operation> children;
	
	



	public abstract void perform(Executor exec);
}
