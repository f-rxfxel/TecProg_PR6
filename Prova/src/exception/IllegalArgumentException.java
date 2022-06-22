package exception;

public class IllegalArgumentException extends RuntimeException {
	
	public IllegalArgumentException() {
		super("A doação sanguínea deve ser no mínimo 0!");
	}

}
