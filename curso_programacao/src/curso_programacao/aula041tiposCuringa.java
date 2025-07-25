package curso_programacao;

import java.util.Arrays;
import java.util.List;

public class aula041tiposCuringa {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStr);
	}

	private static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
