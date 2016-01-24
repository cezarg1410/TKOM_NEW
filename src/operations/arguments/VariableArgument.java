package operations.arguments;

public class VariableArgument extends Argument {

	public VariableArgument(String id,int line ) {
		varId = id;
		this.line = line;
	}

	String varId;

	public String getVarId() {
		return varId;
	}
	
	
}
