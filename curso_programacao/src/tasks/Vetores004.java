package tasks;

import java.util.Locale;
import java.util.Scanner;

public class Vetores004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar ? ");

		int N = sc.nextInt();
		int[] vet = new int[N];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("\nNUMEROS PARES:");

		int pares = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.printf("%d  ", vet[i]);
				pares++;
			}
		}
		System.out.println();
		System.out.print("\nQUANTIDADE DE  PARES =  " + pares);

		sc.close();
	}
}
