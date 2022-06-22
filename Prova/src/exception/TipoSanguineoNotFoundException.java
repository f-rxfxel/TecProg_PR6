package exception;

public class TipoSanguineoNotFoundException extends RuntimeException {
	
	public TipoSanguineoNotFoundException() {
		super("Tipo sanguíneo não encontrado!");
	}
}
