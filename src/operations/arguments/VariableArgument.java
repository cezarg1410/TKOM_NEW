package operations.arguments;

public class VariableArgument extends Argument {

	public VariableArgument(String id) {
		varId = id;
		readyToUse = false;
	}

	String varId;

	public String getVarId() {
		return varId;
	}
	
	
}
