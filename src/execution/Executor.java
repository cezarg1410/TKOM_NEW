package execution;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


import elements.Element;
import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;
import operations.FunctionCall;
import operations.Operation;

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
			res = calledFunctions.getLast().getLocalVariables().get(id);
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

}
