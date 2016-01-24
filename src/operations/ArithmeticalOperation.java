package operations;

import java.util.ArrayList;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class ArithmeticalOperation extends Operation {

	Element<?> left;
	Element<?> right;
	Element<?> ret;
	Argument leftArg;
	Argument rightArg;
	ArithmeticalOperator operator;
	public ArithmeticalOperation(int line)
	{
		this.line = line;
	}
	@Override
	public void perform(Executor exec) {
		calcArgs(exec, line);
		calc();
	}

	private void calc() {
		if(operator.equals(ArithmeticalOperator.PLUS))
		{
			if(left instanceof ListElement && right instanceof ListElement)
			{
				ListElement l = (ListElement) left;
				ListElement r = (ListElement) right;
				ArrayList<Integer> res = new ArrayList<>();
				for(int i = 0 ; i< l .getContent().size() ; i++)
				{
					res.add(l.getContent().get(i));
				}
				for(int i = 0 ; i< r .getContent().size() ; i++)
				{
					res.add(r.getContent().get(i));
				}
				ret = new ListElement(res,line);
			}
			if(left instanceof NumberElement && right instanceof NumberElement)
			{
				NumberElement l = (NumberElement) left;
				NumberElement r = (NumberElement) right;
				Integer res = l.getContent() + r.getContent();
				ret = new NumberElement(res,line);
			}
			else 
				throw new RuntimeException("Nieprawidłowe argumenty dla operatora +. LINIA: "+left.line);
			
		}
		else if(operator.equals(ArithmeticalOperator.SUB))
		{
			if(left instanceof ListElement && right instanceof ListElement)
			{
				ListElement l = (ListElement) left;
				ListElement r = (ListElement) right;
				ArrayList<Integer> res = new ArrayList<>();
				for(int i = 0 ; i< r .getContent().size() ; i++)
				{
					if(l.getContent().contains(r.getContent().get(i)))
						res.remove(r.getContent().get(i));
				}
				ret = new ListElement(res,line);
			}
			if(left instanceof NumberElement && right instanceof NumberElement)
			{
				NumberElement l = (NumberElement) left;
				NumberElement r = (NumberElement) right;
				Integer res = l.getContent() - r.getContent();
				ret = new NumberElement(res,line);
			}
			else 
				throw new RuntimeException("Nieprawidłowe argumenty dla operatora -. LINIA: "+left.line);
		}
		else if(operator.equals(ArithmeticalOperator.MULT))
		{
			if(left instanceof ListElement && right instanceof NumberElement)
			{
				ListElement l = (ListElement) left;
				NumberElement r = (NumberElement) right;
				ArrayList<Integer> res = new ArrayList<>();
				for(int i = 0 ; i< l.getContent().size() ; i++)
				{
					res.add(l.getContent().get(i) * r.getContent());
				}
				ret = new ListElement(res,line);
			}
			else if(left instanceof NumberElement && right instanceof ListElement)
			{
				NumberElement l = (NumberElement) left;
				ListElement r = (ListElement) right;
				ArrayList<Integer> res = new ArrayList<>();
				for(int i = 0 ; i< r.getContent().size() ; i++)
				{
					res.add(r.getContent().get(i) * l.getContent());
				}
				ret = new ListElement(res,line);
			}
			else if(left instanceof NumberElement && right instanceof NumberElement)
			{
				NumberElement l = (NumberElement) left;
				NumberElement r = (NumberElement) right;
				ret = new NumberElement(l.getContent() * r.getContent(),line);
			}
			else 
				throw new RuntimeException("Nieprawidłowe argumenty dla operatora *. LINIA: "+left.line);
		}
		else if(operator.equals(ArithmeticalOperator.DIV))
		{
			if(left instanceof ListElement && right instanceof NumberElement)
			{
				ListElement l = (ListElement) left;
				NumberElement r = (NumberElement) right;
				ArrayList<Integer> res = new ArrayList<>();
				for(int i = 0 ; i< l.getContent().size() ; i++)
				{
					res.add(l.getContent().get(i) / r.getContent());
				}
				ret = new ListElement(res,line);
			}
			else if(left instanceof NumberElement && right instanceof ListElement)
			{
				NumberElement l = (NumberElement) left;
				ListElement r = (ListElement) right;
				ArrayList<Integer> res = new ArrayList<>();
				for(int i = 0 ; i< r.getContent().size() ; i++)
				{
					res.add(r.getContent().get(i) / l.getContent());
				}
				ret = new ListElement(res,line);
			}
			else if(left instanceof NumberElement && right instanceof NumberElement)
			{
				NumberElement l = (NumberElement) left;
				NumberElement r = (NumberElement) right;
				ret = new NumberElement(l.getContent() / r.getContent(),line);
			}
			else 
				throw new RuntimeException("Nieprawidłowe argumenty dla operatora /. LINIA: "+left.line);
		}
		
		
	}

	private void calcArgs(Executor exec,int line) {
		left = Utils.calcArgument(leftArg, exec, line);
		right = Utils.calcArgument(rightArg, exec, line);
	}

	public Element<?> getLeft() {
		return left;
	}

	public void setLeft(Element<?> left) {
		this.left = left;
	}

	public Element<?> getRight() {
		return right;
	}

	public void setRight(Element<?> right) {
		this.right = right;
	}

	public Element<?> getRet() {
		return ret;
	}

	public void setRet(Element<?> ret) {
		this.ret = ret;
	}

	public Argument getLeftArg() {
		return leftArg;
	}

	public void setLeftArg(Argument leftArg) {
		this.leftArg = leftArg;
	}

	public Argument getRightArg() {
		return rightArg;
	}

	public void setRightArg(Argument rightArg) {
		this.rightArg = rightArg;
	}

	public ArithmeticalOperator getOperator() {
		return operator;
	}

	public void setOperator(ArithmeticalOperator operator) {
		this.operator = operator;
	}
	
}
