package execution.exceptions;

public class LackOfVariableException extends RuntimeException{

	public LackOfVariableException(Integer line) {
		super(MESSAGE + line.toString());
	}
	
	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "Brak zmiennej. LINIA: "+"%s";
}
