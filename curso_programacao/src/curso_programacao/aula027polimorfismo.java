package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entity.Account;
import entity.SavingsAccount;

public class aula027polimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account x = new Account(1020,"Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withDraw(50.0);
		y.withDraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		sc.close();
	}

}
