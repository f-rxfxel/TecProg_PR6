package exception;

public class TipoSanguineoNotFoundException extends RuntimeException {
	
	public TipoSanguineoNotFoundException() {
		super("Tipo sangu�neo n�o encontrado!");
	}
}
