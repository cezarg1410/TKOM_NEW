package operations.arguments;

import java.util.ArrayList;

import operations.ArithmeticalOperator;

public class ArithmeticalArgument extends Argument{

	private ArrayList<Argument> args;
	private ArithmeticalOperator operator;
	
	public ArithmeticalArgument(int line)
	{
		args = new ArrayList<>();
		this.line = line;
	}
	
	public ArrayList<Argument> getArgs() 
	{
		return args;
	}

	public void setArgs(ArrayList<Argument> args) 
	{
		this.args = args;
	}

	public ArithmeticalOperator getOperator() {
		return operator;
	}

	public void setOperator(ArithmeticalOperator operator) {
		this.operator = operator;
	}

	

}
