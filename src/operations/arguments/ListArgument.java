package operations.arguments;

import java.util.ArrayList;

public class ListArgument extends Argument {

	public ListArgument(ArrayList<Integer> list) {
		this.content = list;
		readyToUse = true;
	}
	private ArrayList<Integer> content;
	
	public ArrayList<Integer> getContent() {
		return content;
	}

}
