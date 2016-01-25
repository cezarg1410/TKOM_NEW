package operations;

import java.util.LinkedList;

import elements.Element;
import elements.buildInFuncs.BuildInFunctionsEnum;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class LoopOperation extends Operation {

	private LinkedList<Operation> operations;
	private Integer count;
	private Argument arg;
	private Integer current;
	
	public Integer getCurrent() {
		return current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

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
		exec.setCurrentLoop(0);
		ext : for(int i = 0 ; i < count ; i++)
		{
			exec.setCurrentLoop(i+1);
			for(Operation o : operations)
			{
				if(o instanceof ReturnOperation)
				{
					ReturnOperation ro = (ReturnOperation) o;
					if(ro.empty)
						break ext;
					ro.perform(exec);
					break;
				}
				o.perform(exec);
			}
		}
		exec.setCurrentLoop(-1);
	}
}
