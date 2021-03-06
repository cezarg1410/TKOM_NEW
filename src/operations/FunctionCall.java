package operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import elements.Element;
import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;
import elements.buildInFuncs.BuildInFunctionsEnum;
import elements.buildInFuncs.BuildInFunction;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.FunCallArgument;
import operations.arguments.ListArgument;
import operations.arguments.ListElementInIndexArgument;
import operations.arguments.NumberArgument;
import operations.arguments.VariableArgument;

public class FunctionCall extends Operation {

	
	
	private ArrayList<Argument> args;

	private HashMap<String, Element<?>> localVariables;
	private FunctionDefinition fd;
	private LinkedList<Operation> operations;
	private Element<?> ret;
	
	public FunctionCall(FunctionDefinition fd,String id,int line)
	{
		args = new ArrayList<>();
		localVariables = new HashMap<>();
		this.fd = fd;
		this.id = id;
		if(fd!=null)
			operations = fd.getOperations();
		this.line = line;
	}
	public FunctionCall()
	{
		
	}
	
	public void perfromWhenBuildIn(Executor exec)
	{
		Element<?> res = BuildInFunction.call(exec,args,id,line);
		if(res != null)
		{
			ret = res;
		}

	}

	@Override
	public void perform(Executor exec) {
		for(int i = 0 ; i < BuildInFunctionsEnum.values().length ; i++)
		{
			if(id.equals(BuildInFunctionsEnum.getCurrentLoop.toString()))
			{
				if(exec.getCurrentLoop().equals(Integer.valueOf(-1)))
					throw new RuntimeException("NIeprawidłowa funkcja. LINIA: "+line);
				ret = new NumberElement(exec.getCurrentLoop(),line);
				return;
			}
			if(id.equals(BuildInFunctionsEnum.values()[i].toString()))
			{
				perfromWhenBuildIn(exec);
				return;
			}
		}
		
		exec.getCalledFunctions().addFirst(this);
		fd = exec.getFunctions().get(id);
		if (fd == null)
			throw new RuntimeException("Brak takiej funkcji. LINIA: "+line);
		createLocalVariables(exec);
		for(Operation o : operations)
		{
			if(o instanceof ReturnOperation)
			{
				o.perform(exec);
				ret = ((ReturnOperation) o).getRetValue();
				break;
			}
			o.perform(exec);
		}
		exec.getCalledFunctions().removeFirst();
	}
	
	public void createLocalVariables(Executor exec)
	{
		for(int i = 0 ; i< args.size() ; i++)
		{
			if(args.get(i) instanceof ListArgument)
			{
				ListArgument la = (ListArgument) args.get(i);
				localVariables.put(fd.getArgs().get(i), new ListElement(la.getContent(),line));
			}
			else if(args.get(i) instanceof NumberArgument)
			{
				NumberArgument na = (NumberArgument) args.get(i);
				localVariables.put(fd.getArgs().get(i), new NumberElement(na.getNumber(),line));
			}
			else if(args.get(i) instanceof ListElementInIndexArgument)
			{
				ListElementInIndexArgument le = (ListElementInIndexArgument) args.get(i);
				localVariables.put(fd.getArgs().get(i), new NumberElement(exec.getIntegerFromListIndex(le.getId(), le.getIndex(),line),line));
			}
			else if(args.get(i) instanceof VariableArgument)
			{
				VariableArgument va = (VariableArgument) args.get(i);
				localVariables.put(fd.getArgs().get(i), exec.getVar(va.getVarId(),line));
			}
			else if(args.get(i) instanceof FunCallArgument)
			{
				FunCallArgument fc = (FunCallArgument) args.get(i);
				int a =2;
			}
		}
	}

	public HashMap<String, Element<?>> getLocalVariables() {
		return localVariables;
	}

	public  Element<?> getLocalVar(String id) {
		
		Element<?> res = localVariables.get(id);
		return res;
	}
	
	public ArrayList<Argument> getArgs() {
		return args;
	}

	public void setArgs(ArrayList<Argument> args) {
		this.args = args;
	}

	public Element<?> getRet() {
		return ret;
	}

	public void setRet(Element<?> ret) {
		this.ret = ret;
	}
	
}
