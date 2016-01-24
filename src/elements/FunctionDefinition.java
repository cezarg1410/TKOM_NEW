package elements;

import java.util.ArrayList;
import java.util.LinkedList;

import operations.Operation;

public class FunctionDefinition{

	public ArrayList<String> args;
	public LinkedList<Operation> operations;
	public int line;
	
	public FunctionDefinition(int line)
	{
		args = new ArrayList<>();
		operations = new LinkedList<>();
		this.line = line;
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
