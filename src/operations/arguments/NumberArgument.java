package operations.arguments;

public class NumberArgument extends Argument {

	public NumberArgument(int parseInt,int line) {
		number = parseInt;
		this.line = line;
	}

	Integer number;

	public Integer getNumber() {
		return number;
	}
	
	
}
