package execution.exceptions;

public class ExecutionException extends RuntimeException {

	public ExecutionException(Integer line) {
		super(MESSAGE + line.toString());
	}
	
	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "Błąd wykonania. LINIA: "+"%s";

}
