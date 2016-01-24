package operations;

import java.util.ArrayList;
import java.util.LinkedList;

import execution.Executor;

public class IFOperation extends Operation{

	public IFOperation(int line)
	{
		thenOperations = new LinkedList<>();
		elseOperations = new LinkedList<>();
		conditions = new ArrayList<>();
		operators = new ArrayList<>();
		scores = new ArrayList<>();
		this.line = line;
	}	
	
	private LinkedList<Operation> thenOperations;
	private LinkedList<Operation> elseOperations;
	private ArrayList<ElementaryCondition> conditions;
	private ArrayList<LogicalOperator> operators;
	private ArrayList<Boolean> scores;
	private boolean result;
	
	@Override
	public void perform(Executor exec) {
		for(ElementaryCondition cond : conditions)
		{
			boolean res = cond.eval(exec);
			System.out.println("WARUNEK LOGICZNY: " +res);
			scores.add(res);

		}
		boolean res = false;
		for(int i = 0 ; i<scores.size() ; i++)
		{
			if(i == 0)
				res = scores.get(i);
			else 

			{
				boolean next = scores.get(i);
				if(operators.get(i-1).equals(LogicalOperator.AND))
					res = res & next;
				else
					res = res | next;
			}
		}
		System.out.println("WYNIK TO: " + res);
		this.result = res;
		execute(exec);
	}

	public void execute(Executor exec)
	{
		if(result)
		{
			for(Operation o : thenOperations)
				o.perform(exec);
		}
		else
		{
			for(Operation o : elseOperations)
				o.perform(exec);
		}
	}
	
	
	public ArrayList<ElementaryCondition> getConditions() {
		return conditions;
	}

	public void setConditions(ArrayList<ElementaryCondition> conditions) {
		this.conditions = conditions;
	}

	public ArrayList<LogicalOperator> getOperators() {
		return operators;
	}

	public LinkedList<Operation> getThenOperations() {
		return thenOperations;
	}

	public LinkedList<Operation> getElseOperations() {
		return elseOperations;
	}
	
	
}
