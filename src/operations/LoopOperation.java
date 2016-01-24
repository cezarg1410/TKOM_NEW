package operations;

import java.util.LinkedList;

import elements.Element;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class LoopOperation extends Operation {

	private LinkedList<Operation> operations;
	private Integer count;
	private Argument arg;
	
	public LoopOperation(Argument arg,int line)
	{
		operations = new LinkedList<>();
		this.arg = arg;
		this.line = line;
	}
	
	public LinkedList<Operation> getOperations() {
		return operations;
	}

	public void setOperations(LinkedList<Operation> operations) {
		this.operations = operations;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public void perform(Executor exec) {
		Element<?> el = Utils.calcArgument(arg, exec, line);
		count = (Integer) el.getContent();

		for(int i = 0 ; i < count ; i++)
		{
			for(Operation o : operations)
			{
				o.perform(exec);
			}
		}
	}
}
