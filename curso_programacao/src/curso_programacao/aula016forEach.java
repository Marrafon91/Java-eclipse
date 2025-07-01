package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula016forEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Guilherme"};
		
		for(String vet : vect) {
			System.out.println(vet);
		}
		
		sc.close();
	}

}
