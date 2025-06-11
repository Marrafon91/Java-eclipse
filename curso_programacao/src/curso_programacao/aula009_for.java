package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula009_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		for(int i = 0;i < n;i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
//		for(int i = 10;i >= 0;i--) {
//			System.out.println(i);
//		}
			
		
		
		System.out.println("Soma dos numeros = " + soma);		
		
		sc.close();
	}

}
