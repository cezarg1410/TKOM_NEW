package elements;

public class NumberElement extends Element<Integer> {

	public NumberElement(Integer content,int line) {
		
		super(content,line);
	}

	@Override
	public String toString() {
		return "NumberElement [id=" + id + ", ids=" + ids + ", content=" + content + "]";
	}

}
