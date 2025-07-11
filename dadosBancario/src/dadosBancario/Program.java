package dadosBancario;

import java.util.Locale;
import java.util.Scanner;

import dadosServidor.AccountServer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AccountServer account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().toLowerCase().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new AccountServer(number, holder, initialDeposit);
		} else {
			account = new AccountServer(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.print("\nwithdraw tax equals 5.00 $ ");

		sc.close();
	}

}
