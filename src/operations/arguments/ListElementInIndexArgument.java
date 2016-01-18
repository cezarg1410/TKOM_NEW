package operations.arguments;

public class ListElementInIndexArgument extends Argument {

	String id;
	Integer index;
		
	public ListElementInIndexArgument(String string, int parseInt) {
		id = string;
		index = parseInt;
		readyToUse = false;
	}
	
	public String getId() {
		return id;
	}
	public Integer getIndex() {
		return index;
	}

}
