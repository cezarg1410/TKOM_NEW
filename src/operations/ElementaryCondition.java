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
		calcArg(true,leftArg,exec);
		calcArg(false,rightArg,exec);
	}



	private void calcArg(boolean left, Argument arg, Executor exec) 
	{
		Element<?> elem = null;
		if(arg instanceof FunCallArgument)
		{
			//TODO fun_call
		}
		else if(arg instanceof ListArgument)
		{
			elem = new ListElement(((ListArgument) arg).getContent());
		}
		else if(arg instanceof ListElementInIndexArgument)
		{
			elem  = new NumberElement(exec.getIntegerFromListIndex(((ListElementInIndexArgument) arg).getId(), ((ListElementInIndexArgument) arg).getIndex()));
		}
		else if(arg instanceof NumberArgument)
		{
			elem  = new NumberElement(((NumberArgument) arg).getNumber());
		}
		else if(arg instanceof VariableArgument)
		{
			elem = exec.getVar(((VariableArgument) arg).getVarId());
		}
		if(left)
		{
			this.left = elem;
		}
		else
		{
			this.right = elem;
		}
		
	}
}
