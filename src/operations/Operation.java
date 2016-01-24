package operations;

import java.util.LinkedList;

import execution.Executor;

public abstract class Operation {

	String id;
	Operation parent;
	LinkedList <Operation> children;
	private Integer start;
	private Integer stop;

	public abstract void perform(Executor exec);
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getStop() {
		return stop;
	}
	public void setStop(Integer stop) {
		this.stop = stop;
	}
}
