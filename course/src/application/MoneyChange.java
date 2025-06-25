package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class MoneyChange {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");		
		CurrencyConverter.amountDollar = sc.nextDouble();
		
		double iof = CurrencyConverter.currencyChange(6.0);
		System.out.printf("Amount to be paid in R$ = %.2f%n", iof);
		
		sc.close();
	}

}
