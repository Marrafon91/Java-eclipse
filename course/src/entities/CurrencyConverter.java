package entities;

public class CurrencyConverter {

	public static double dollarPrice;
	public static double amountDollar;

	public static double dollar() {
		return dollarPrice;
	}

	public static double amountDollar() {
		return amountDollar;
	}

	public static double currencyChange(double iofPercent) {
		double iof = amountDollar *  dollarPrice;
		double totalComIof = iof + (iof * iofPercent) / 100;
		return totalComIof;
		
	}

}
