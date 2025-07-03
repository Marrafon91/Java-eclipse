package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		int maisVelho = idades[0];
		int posicao = 0;

		for (int i = 0; i < N; i++) {
			if (idades[i] > maisVelho) {
				maisVelho = idades[i];
				posicao = i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicao]);
		sc.close();
	}

}
