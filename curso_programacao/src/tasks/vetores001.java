package tasks;

import java.util.Locale;
import java.util.Scanner;

public class vetores001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] vet = new int[N];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}		
		
		System.out.println("Numeros Negativos:");
		for(int i = 0;i < vet.length; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i] );
			}
		}

		sc.close();
	}

}
