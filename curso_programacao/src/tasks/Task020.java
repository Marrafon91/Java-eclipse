package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task020 {

	public static void main(String[] args) {
//	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
//	de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
//	conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
//	peso 5. 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0;i < n; i++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double resultado = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
			
			System.out.printf("Sua media: %.1f%n", resultado);
			
		} 
		
		sc.close();
	}

}
