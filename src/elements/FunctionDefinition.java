package elements;

import java.util.ArrayList;
import java.util.LinkedList;

import operations.Operation;
import operations.arguments.Argument;

public class FunctionDefinition{

	public ArrayList<String> args;
	public LinkedList<Operation> operations;
	
	public FunctionDefinition()
	{
		args = new ArrayList<>();
		operations = new LinkedList<>();
	}
	
	
	public ArrayList<String> getArgs() {
		return args;
	}
	public void setArgs(ArrayList<String> args) {
		this.args = args;
	}
	public LinkedList<Operation> getOperations() {
		return operations;
	}
	public void setOperations(LinkedList<Operation> operations) {
		this.operations = operations;
	}
	@Override
	public String toString() {
		return "FunctionDefinition [args=" + args + ", operations=" + operations + "]";
	}

	
	
}
