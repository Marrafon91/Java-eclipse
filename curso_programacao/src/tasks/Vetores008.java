package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vet = new int[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		int somaPares = 0;
		double soma = 0.0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				somaPares++;
			}
		}

		if (somaPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double media = soma / somaPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		sc.close();
	}

}
