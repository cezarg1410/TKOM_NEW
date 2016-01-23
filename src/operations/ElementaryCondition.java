package operations;

import java.util.ArrayList;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.FunCallArgument;
import operations.arguments.ListArgument;
import operations.arguments.ListElementInIndexArgument;
import operations.arguments.NumberArgument;
import operations.arguments.VariableArgument;
import utils.Utils;

public class ElementaryCondition {

	Argument leftArg;
	Argument rightArg;
	Element<?> left;
	LogicalOperator operator;
	Element<?> right;
	boolean result;
	public ElementaryCondition(Element<?> left, LogicalOperator operator, Element<?> right)
	{
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	
	
	public ElementaryCondition(Argument firstArg, LogicalOperator lo, Argument secondArg) 
	{
		this.leftArg = firstArg;
		this.rightArg = secondArg;
		this.operator = lo;
	}



	public boolean eval(Executor exec)
	{
		calcArgs(exec);
		if(left instanceof ListElement && right instanceof ListElement)
		{
			ListElement first = (ListElement) left;
			ListElement second = (ListElement) right;
			ArrayList<Integer> firstContent = first.getContent();
			ArrayList<Integer> secondContent = second.getContent();

			if(operator.equals(LogicalOperator.EQUAL))
			{
				if(firstContent.equals(secondContent))
				{
					result = true;
					return true;
				}
				result = false;
				return false;
			}
			else if(operator.equals(LogicalOperator.NEQUAL))
			{
				if(!firstContent.equals(secondContent))
				{
					result = true;
					return true;
				}
				result = false;
				return false;
			}
			else
				throw new RuntimeException("Niepoprawy operator logiczny");
		}
		else if(left instanceof NumberElement && right instanceof NumberElement)
		{
			Integer first = (Integer) left.getContent();
			Integer second = (Integer) right.getContent();
			
			if(operator.equals(LogicalOperator.EQUAL))
				return first.equals(second);
			if(operator.equals(LogicalOperator.NEQUAL))
				return !first.equals(second);
			if(operator.equals(LogicalOperator.GT))
				return first > second;
			if(operator.equals(LogicalOperator.GE))
				return first >= second;
			if(operator.equals(LogicalOperator.LT))
					return first < second;
			if(operator.equals(LogicalOperator.LE))
				return first <= second;
			throw new RuntimeException("Niepoprawny operator logiczny");
				
		}
		else if(left instanceof ListElement && right instanceof NumberElement)
		{
			throw new RuntimeException("Niepoprawny operator logiczny");
		}
		else if(left instanceof NumberElement && right instanceof ListElement)
		{
			throw new RuntimeException("Niepoprawny operator logiczny");
		}
		else 
			throw new RuntimeException("Niepoprawne argumenty funkcji logicznej");
	}



	private void calcArgs(Executor exec) 
	{
		left = Utils.calcArgument(leftArg, exec);
		right = Utils.calcArgument(rightArg, exec);
	}

}
