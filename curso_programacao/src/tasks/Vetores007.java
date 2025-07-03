package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		double[] num = new double[N];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < num.length; i++) {
			soma += num[i];
		}

		double media = soma / N;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < num.length; i++) {
			if (num[i] < media) {

				System.out.printf("%.1f%n", num[i]);
			}
		}

		sc.close();
	}

}
