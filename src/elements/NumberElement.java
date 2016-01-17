package elements;

public class NumberElement extends Element<Integer> {

	public NumberElement(Integer content) {
		
		super(content);
	}

	@Override
	public String toString() {
		return "NumberElement [id=" + id + ", ids=" + ids + ", content=" + content + "]";
	}

}
