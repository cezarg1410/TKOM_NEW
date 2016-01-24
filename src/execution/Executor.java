package execution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


import elements.Element;
import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;
import operations.ArithmeticalOperation;
import operations.ArithmeticalOperator;
import operations.FunctionCall;
import operations.Operation;
import operations.arguments.Argument;
import operations.arguments.ArithmeticalArgument;
import operations.arguments.FunCallArgument;

public class Executor {
	

	private LinkedList<Operation> operations;
	private LinkedList<FunctionCall> calledFunctions;
	private HashMap<String, Element<?>> globalVariables;
	private HashMap<String, FunctionDefinition> functions;
	public Executor()
	{
		operations = new LinkedList<>();
		calledFunctions = new LinkedList<>();
		globalVariables = new HashMap<>();
		functions = new HashMap<>();
		
	}
	
	public HashMap<String, Element<?>> getGlobalVariables() {
		return globalVariables;
	}

	public void setGlobalVariables(HashMap<String, Element<?>> globalVariables) {
		this.globalVariables = globalVariables;
	}

	public LinkedList<Operation> getOperations() {
		return operations;
	}

	public void setOperations(LinkedList<Operation> operations) {
		this.operations = operations;
	}

	public LinkedList<FunctionCall> getCalledFunctions() {
		return calledFunctions;
	}

	public void setCalledFunctions(LinkedList<FunctionCall> calledFunctions) {
		this.calledFunctions = calledFunctions;
	}
	
	public HashMap<String, FunctionDefinition> getFunctions() {
		return functions;
	}

	public void setFunctions(HashMap<String, FunctionDefinition> functions) {
		this.functions = functions;
	}

	public void run()
	{
		for(Operation o : operations)
		{
			o.perform(this);
		}
	}
	
	public void print()
	{
		for (Map.Entry<String, Element<?>> entry : globalVariables.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		for(Map.Entry<String, FunctionDefinition> entry : functions.entrySet())
		{
			System.out.println(entry.toString());
		}
	}
	
	public Element<?> getVar(String id)
	{
		Element<?> res = null;
		if(calledFunctions.size() !=0)
		{
			res = calledFunctions.getFirst().getLocalVariables().get(id);
		}
		if(res == null)
			res = getGlobalVariables().get(id);
		if(res == null)
			throw new RuntimeException("Brak takiej zmiennej !!");
		return res;
	}
	
	public ListElement getListElement(String id)
	{
		ListElement elem = (ListElement) getVar(id);
		return elem;
	}
	
	public NumberElement getNumberElement(String id)
	{
		NumberElement elem = (NumberElement) getVar(id);
		return elem;
	}
	
	public Integer getIntegerFromListIndex(String id, Integer index)
	{	
		return getListElement(id).getContent().get(index);	
	}
	
	public Element<?> callOuterFunction(FunCallArgument arg)
	{
		FunctionCall fc = new FunctionCall(functions.get(arg.getFuncId()),arg.getFuncId());
		fc.setArgs(arg.getArgs());
		fc.perform(this);
		return fc.getRet();
	}

	public Element<?> callArithmeticalOperation(Argument left,Argument right,ArithmeticalOperator ap) {
		ArithmeticalOperation ao = new ArithmeticalOperation();
		ao.setLeftArg(left);
		ao.setRightArg(right);
		ao.setOperator(ap);
		ao.perform(this);
		return ao.getRet();
	}

}
