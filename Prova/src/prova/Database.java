package prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Database {
	
	private static ArrayList<Doador> doadores = new ArrayList<Doador>();
	private static Map<String, Long> estoqueSanguineo = new HashMap<String, Long>();
	
	public static void addDoador(Doador doador) {
		doadores.add(doador);
		System.out.println("Doador adicionado!");
	}
	
	public static void addDoacao(String tipoSanguineo, Long quantidade) {
		estoqueSanguineo.put(tipoSanguineo, quantidade);
		System.out.println("Doação adicionada!");
	}
	
	public static Long getSituacaoEstoque(String tipoSanguineo) {
		
		Iterator it = estoqueSanguineo.entrySet().iterator();
		long qtd = 0;
		
		System.out.println("Quantidade de sangue do tipo " + tipoSanguineo + " restante:");
	    while (it.hasNext()) 
	    {
	        Map.Entry pairs = (Map.Entry)it.next();
	        
	        if(pairs.getKey().equals(tipoSanguineo)) {
	        	System.out.println(pairs.getKey() + " = " + pairs.getValue());
	        	qtd += (long) pairs.getValue();
	        }
	        //it.remove();
	    }
		
		return null;
	}
	
}
