package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula015obj {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 20;
		
		Integer obj = x;
		System.out.println(obj);
		
		int y = obj * 2;
		
		System.out.println(y);		
		
		
		sc.close();
	}

}
