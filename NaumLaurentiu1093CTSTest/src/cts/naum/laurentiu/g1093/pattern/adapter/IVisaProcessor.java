package cts.naum.laurentiu.g1093.pattern.adapter;

public interface IVisaProcessor {

    public void transaction(String sourseAccount, String destinationAccount, double value, String currency);

    public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
            String sourseCurrency, String destinationCurrency);

}