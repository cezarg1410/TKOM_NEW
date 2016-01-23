package operations;

import java.util.LinkedList;

import execution.Executor;

public abstract class Operation {

	String id;
	Operation parent;
	LinkedList <Operation> children;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract void perform(Executor exec);
}
