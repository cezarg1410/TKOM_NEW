package operations.arguments;

public class ListElementInIndexArgument extends Argument {

	String id;
	Integer index;
		
	public ListElementInIndexArgument(String string, int parseInt,int line) {
		id = string;
		index = parseInt;
		this.line = line;
	}
	
	public String getId() {
		return id;
	}
	public Integer getIndex() {
		return index;
	}

}
