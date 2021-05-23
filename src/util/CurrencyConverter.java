package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double amount(double price, double quantity) {
		return (quantity * (1 + IOF)) * price;
	}
}
