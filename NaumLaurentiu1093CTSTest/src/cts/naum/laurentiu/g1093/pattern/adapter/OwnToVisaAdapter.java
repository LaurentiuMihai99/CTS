package cts.naum.laurentiu.g1093.pattern.adapter;

public class OwnToVisaAdapter extends OwnBank {

	IVisaProcessor visaProcessor = null;
	
	public OwnToVisaAdapter(IVisaProcessor visaProcessor) {
		super();
		this.visaProcessor = visaProcessor;
	}
	
	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {
		System.out.println("Sending transaction to Visa");
		this.visaProcessor.transaction(sourseAccount, destinationAccount, value, currency);
	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {
		double exchangedAmount = exchange(value, getExchangeRate(sourseCurrency, destinationCurrency));
		this.transaction(sourseAccount, destinationAccount, exchangedAmount, destinationCurrency);
	}

	@Override
	public double exchange(double amount, double exchangeRate) {
		return amount * exchangeRate;
	}

	@Override
	public double getExchangeRate(String sourceCurrency, String destinationCurrency) {
		//In an actual implementation the exchangeRate would not be hard-coded and would be taken from
		//an actual system based on sourseCurrency and destinationCurrency, but it's beyond the scope of this test 
		return 1.5;
	}

}
