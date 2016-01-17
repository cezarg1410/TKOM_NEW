package operations;

import java.util.ArrayList;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;

public class ElementaryCondition {

	Element<?> left;
	LogicalOperator operator;
	Element<?> right;

	public ElementaryCondition(Element<?> left, LogicalOperator operator, Element<?> right)
	{
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	
	
	public boolean eval(Executor exec)
	{
		if(left instanceof ListElement && right instanceof ListElement)
		{
			ListElement first = (ListElement) left;
			ListElement second = (ListElement) right;
			ArrayList<Integer> firstContent = first.getContent();
			ArrayList<Integer> secondContent = second.getContent();

			if(operator.equals(LogicalOperator.EQUAL))
			{
				if(firstContent.equals(secondContent))
					return true;
				return false;
			}
			else if(operator.equals(LogicalOperator.NEQUAL))
			{
				if(!firstContent.equals(secondContent))
					return true;
				return false;
			}
			else
				throw new RuntimeException("Niepooprawy operator logiczny");
		}
		else if(left instanceof NumberElement && right instanceof NumberElement)
		{
			return true;
		}
		else if(left instanceof ListElement && right instanceof NumberElement)
		{
			return true;
		}
		else if(left instanceof NumberElement && right instanceof ListElement)
		{
			return true;
		}
		else 
			throw new RuntimeException("Niepoprawne argumenty funkcji logicznej");
	}
}
