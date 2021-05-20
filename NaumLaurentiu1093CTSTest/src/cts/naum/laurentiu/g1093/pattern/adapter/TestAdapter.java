package cts.naum.laurentiu.g1093.pattern.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		OwnToVisaAdapter adapter = new OwnToVisaAdapter(new ExternalProcessor());
		adapter.transaction("acc1", "acc2", 100, "RON");
		adapter.transactionWithCurrencyExchange("acc3", "acc4", 500, "RON", "USD");
		adapter.transactionWithCurrencyExchange("acc5", "acc6", 1000, "EUR", "USD");
		adapter.transaction("acc7", "acc8", 100, "RON");

	}

}
