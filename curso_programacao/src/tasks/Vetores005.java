package tasks;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Vetores005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		double[] vet = new double[N];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		double maiorValor = vet[0];
		int posicao = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
				posicao = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.2f%n", maiorValor);
		System.out.print("POSICAO DO MAIOR VALOR = " + posicao);

		sc.close();
	}

}
