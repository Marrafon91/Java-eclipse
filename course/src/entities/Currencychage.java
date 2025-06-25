package entities;

public class Currencychage {

	public static double dollarPrice;
	public static double amountOfDollar;

	public static double currencyWithIof(double iofPercent) {
		double iof = amountOfDollar *  dollarPrice;
		double totalWithIof = iof + (iof * iofPercent) / 100;
		return totalWithIof;		
	}

}
