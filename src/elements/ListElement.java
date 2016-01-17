package elements;

import java.util.ArrayList;

public class ListElement extends Element<ArrayList<Integer>> {

	public ListElement(ArrayList<Integer> content)
	{
		super(content);
	}

	@Override
	public String toString() {
		return "ListElement [id=" + id + ", ids=" + ids + ", content=" + content + "]";
	}
	
	@Override
	public ArrayList<Integer> getContent()
	{
		return (ArrayList<Integer>) content;
	}
}
