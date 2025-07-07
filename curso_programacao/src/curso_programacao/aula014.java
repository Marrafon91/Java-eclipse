package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entity.Product014;

public class aula014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Product014[] vect = new Product014[N];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product014(name, price);
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}

		double avg = soma / vect.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();
	}

}
