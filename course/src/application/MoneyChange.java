package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Currencychage;

public class MoneyChange {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Currencychage.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");		
		Currencychage.amountOfDollar = sc.nextDouble();
		
		double iof = Currencychage.currencyWithIof(6.0);
		System.out.printf("Amount to be paid in R$ = %.2f%n", iof);
		
		sc.close();
	}

}
