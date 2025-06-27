package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class aula013vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] vet = new double[N];

		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			soma += vet[i];
		}
		double media = soma / N;
		System.out.printf("Altura media = %.2f%n", media);

		sc.close();
	}

}
