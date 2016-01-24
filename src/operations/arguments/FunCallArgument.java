package operations.arguments;

import java.util.ArrayList;

public class FunCallArgument extends Argument {

	
	public FunCallArgument(String id)
	{
		funcId = id;
		args = new ArrayList<>();
	}
	
	public ArrayList<Argument> getArgs() {
		return args;
	}

	public void setArgs(ArrayList<Argument> args) {
		this.args = args;
	}

	public void setFuncId(String funcId) {
		this.funcId = funcId;
	}

	private String funcId;
	private ArrayList<Argument> args;
	
	public String getFuncId() {
		return funcId;
	}
	
	
}
