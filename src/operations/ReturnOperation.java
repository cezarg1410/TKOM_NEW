package operations;

import elements.Element;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class ReturnOperation extends Operation {

	public ReturnOperation(Boolean empty)
	{
		this.empty = empty;
	}
	Element<?> retValue;
	Argument retArg;
	public Boolean empty;
	
	public Element<?> getRetValue() {
		return retValue;
	}

	public void setRetValue(Element<?> retValue) {
		this.retValue = retValue;
	}

	public Argument getRetArg() {
		return retArg;
	}

	public void setRetArg(Argument retArg) {
		this.retArg = retArg;
	}

	@Override
	public void perform(Executor exec) {
		if(empty)
			return;
		retValue = Utils.calcArgument(retArg, exec, line);
		if(exec.getCalledFunctions().size() != 0)
		{
			exec.getCalledFunctions().getFirst().setRet(retValue);
		}
	}

}
