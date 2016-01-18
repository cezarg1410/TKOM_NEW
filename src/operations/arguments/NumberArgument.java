package operations.arguments;

public class NumberArgument extends Argument {

	public NumberArgument(int parseInt) {
		number = parseInt;
		readyToUse = true;
	}

	Integer number;

	public Integer getNumber() {
		return number;
	}
	
	
}
