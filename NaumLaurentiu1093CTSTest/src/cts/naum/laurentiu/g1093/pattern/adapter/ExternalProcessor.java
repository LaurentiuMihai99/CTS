package cts.naum.laurentiu.g1093.pattern.adapter;

public class ExternalProcessor implements IVisaProcessor {

	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {
		System.out.println("Visa Transaction from " + sourseAccount + " to " + destinationAccount);
		
	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {
		System.out.println("Visa Transaction with currency exchange from " + sourseAccount + 
				" to " + destinationAccount);
		
	}

}
