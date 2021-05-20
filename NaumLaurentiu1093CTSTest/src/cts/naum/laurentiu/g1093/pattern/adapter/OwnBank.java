package cts.naum.laurentiu.g1093.pattern.adapter;

public abstract class OwnBank {
	
	public abstract void transaction(String sourseAccount, String destinationAccount, double value, 
			String currency);
	public abstract void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount,
			double value, String sourseCurrency, String destinationCurrency);
	public abstract double exchange(double amount, double exchangeRate);
	public abstract double getExchangeRate(String sourceCurrency, String destinationCurrency);
}
