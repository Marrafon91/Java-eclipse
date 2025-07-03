package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pessoas serao digitados? ");
		int N = sc.nextInt();
		double[] alturas = new double[N];
		char[] genero = new char[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Altura da " + (i + 1) + " pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + " pessoa: ");
			genero[i] = sc.next().charAt(0);
		}

		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];

		for (int i = 0; i < N; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}

			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}

		int homens = 0;
		int mulheres = 0;
		double alturaMulheres = 0;

		for (int i = 0; i < N; i++) {
			if (genero[i] == 'M' || genero[i] == 'm') {
				homens++;
			} else {
				mulheres++;
				alturaMulheres = alturaMulheres + alturas[i];
			}
		}

		double mediaAltura = alturaMulheres / mulheres;

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltura);
		System.out.println("Numero de homens = " + homens);
		sc.close();
	}

}
