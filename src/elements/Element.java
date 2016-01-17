package elements;

public abstract class Element<T> {

	Long id;
	String ids;
	boolean ghostElement;
	
	T content;
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Element(T content)
	{
		ghostElement = false;
		this.content = content;
	}
}
