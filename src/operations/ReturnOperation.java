package operations;

import elements.Element;
import execution.Executor;
import operations.arguments.Argument;
import utils.Utils;

public class ReturnOperation extends Operation {

	Element<?> retValue;
	Argument retArg;
	
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
		
		retValue = Utils.calcArgument(retArg, exec);
		if(exec.getCalledFunctions().size() != 0)
		{
			exec.getCalledFunctions().getFirst().setRet(retValue);
		}
	}

}
