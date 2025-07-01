package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qunatos numeros voce vai digitar ? ");
		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		double media = soma / vet.length;
		
		System.out.print("VALORES = ");
		
		for(int i = 0;i < vet.length; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		
		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);

		sc.close();
	}
}
