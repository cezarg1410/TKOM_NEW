package operations.arguments;

import java.util.ArrayList;

public class ListArgument extends Argument {

	public ListArgument(ArrayList<Integer> list) {
		this.content = list;
	}
	private ArrayList<Integer> content;
	
	public ArrayList<Integer> getContent() {
		return content;
	}

}
