package operations;

import java.util.ArrayList;
import java.util.LinkedList;

import execution.Executor;

public class IFOperation extends Operation{

	private LinkedList<Operation> thenOperations;
	private LinkedList<Operation> elseOperations;
	private ArrayList<ElementaryCondition> conditions;
	private ArrayList<LogicalOperator> operators;
	
	@Override
	public void perform(Executor exec) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<ElementaryCondition> getConditions() {
		return conditions;
	}

	public void setConditions(ArrayList<ElementaryCondition> conditions) {
		this.conditions = conditions;
	}

}
