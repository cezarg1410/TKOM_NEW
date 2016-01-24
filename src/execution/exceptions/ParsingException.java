package execution.exceptions;

public class ParsingException extends RuntimeException {

	public ParsingException(String msg) {
		super(MESSAGE + msg);
	}
	
	private static final long serialVersionUID = 1L;

	private static final String MESSAGE = "Błąd parsowania. LINIA: "+"%s";

}
