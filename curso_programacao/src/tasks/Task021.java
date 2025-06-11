package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task021 {

	public static void main(String[] args) {

//	Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//  segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double resultado = num1 / num2;
			if (resultado == 0) {
				System.out.println("Divisão impossivel");
			}
			System.out.printf("%.1f%n", resultado);
		}

		sc.close();
	}

}
