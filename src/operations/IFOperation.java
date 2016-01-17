package operations;

import java.util.ArrayList;
import java.util.LinkedList;

import execution.Executor;

public class IFOperation extends Operation{

	public IFOperation()
	{
		thenOperations = new LinkedList<>();
		elseOperations = new LinkedList<>();
		conditions = new ArrayList<>();
		operators = new ArrayList<>();
		scores = new ArrayList<>();
	}	
	
	private LinkedList<Operation> thenOperations;
	private LinkedList<Operation> elseOperations;
	private ArrayList<ElementaryCondition> conditions;
	private ArrayList<LogicalOperator> operators;
	private ArrayList<Boolean> scores;
	
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
	
	
}
