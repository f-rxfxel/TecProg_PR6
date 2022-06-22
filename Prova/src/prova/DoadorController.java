package prova;

public class DoadorController extends IllegalArgumentException{
	
	
	public static void cadastrarDoador(Long cpf, String tipoSanguineo) {
		
		if(tipoSanguineo.equalsIgnoreCase(TipoSanguineo.values())) {
			
		}
		
	}
	
	public static void cadastrarDoacao(String tipoSanguineo, Long quantidade) {
		
		if(quantidade < 0) {
			throw new IllegalArgumentException();
		}
		
	}

}
