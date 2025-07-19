package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o numero da conta ? ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withDrwaLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withDrwaLimit);

		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();

		try {
			acc.withDraw(amount);
			System.out.printf("Novo Saldo: %.2f%n", acc.getBalance());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
