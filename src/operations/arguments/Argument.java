package operations.arguments;

public abstract class Argument {
	
	public Argument()
	{}
	
	private Integer start;
	private Integer stop;
	
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
