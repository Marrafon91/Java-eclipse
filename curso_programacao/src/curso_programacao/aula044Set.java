package curso_programacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class aula044Set {

	public static void main(String[] args) {
	
//		Set<String> set = new HashSet<>();  mais rapido se a ordem nao importar
//		Set<String> set = new TreeSet<>(); mais lento mais mantem a ordem.
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
