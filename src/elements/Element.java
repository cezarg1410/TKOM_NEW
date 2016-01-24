package elements;

public abstract class Element<T> {

	Long id;
	String ids;
	boolean ghostElement;
	T content;
	private Integer start;
	private Integer stop;
	
	public Element(T content)
	{
		ghostElement = false;
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
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
