package curso_programacao;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class aula044Set {

	public static void main(String[] args) {
	
//		Set<String> set = new HashSet<>();  mais rapido se a ordem nao importar
//		Set<String> set = new TreeSet<>(); mais lento mais mantem a ordem.
		Set<String> set = new LinkedHashSet<>();
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
			
	}

}
