package execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import operations.FunctionCall;
import operations.Operation;

public class Executor {
	

	private LinkedList<Operation> operations;
	private LinkedList<FunctionCall> calledFunctions;
	private HashMap<String, Element<?>> globalVariables;

	public Executor()
	{
		operations = new LinkedList<>();
		calledFunctions = new LinkedList<>();
		globalVariables = new HashMap<String, Element<?>>();
		
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
	}
	
	public Element<?> getVar(String id)
	{
		if(calledFunctions.size() !=0)
		{
			return calledFunctions.getLast().getLocalVariables().get(id);
		}
		if(getGlobalVariables().get(id) == null)
			throw new RuntimeException("Brak takiej zmiennej !!");
		return getGlobalVariables().get(id);
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
