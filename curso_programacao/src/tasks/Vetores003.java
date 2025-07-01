package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}

		double alturaGeral = 0.0;
		int menores = 0;
		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				menores++;
			}
			alturaGeral += alturas[i];
		}

		double alutraMedia = alturaGeral / N;
		double menoresPorcento = ((double) menores / N) * 100.0;

		System.out.printf("\nAltura media = %.2f\n", alutraMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", menoresPorcento);

		for (int i = 0; i < N; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}

		sc.close();
	}

}
