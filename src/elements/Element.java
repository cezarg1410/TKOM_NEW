package elements;

public abstract class Element<T> {

	Long id;
	String ids;
	boolean ghostElement;
	T content;
	public int line;
	
	public Element(T content, int line)
	{
		ghostElement = false;
		this.content = content;
		this.line = line;
	}
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
