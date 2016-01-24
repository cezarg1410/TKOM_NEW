package operations.arguments;

import java.util.ArrayList;

public class ListArgument extends Argument {

	public ListArgument(ArrayList<Integer> list,int line) {
		this.content = list;
		this.line = line;
	}
	private ArrayList<Integer> content;
	
	public ArrayList<Integer> getContent() {
		return content;
	}

}
