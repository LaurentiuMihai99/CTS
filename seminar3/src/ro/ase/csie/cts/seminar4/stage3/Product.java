package ro.ase.csie.cts.seminar4.stage3;

import ro.ase.csie.cts.seminar3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.seminar4.stage3.services.MarketingInterface;
import ro.ase.csie.cts.seminar4.stage3.services.ValidatorInterface;
import ro.ase.csie.cts.seminar4.stage3.test.TestProduct;

public class Product {
	
	MarketingInterface mkService = null;
	ValidatorInterface validatorService = null;
	
	public Product() {
		for (Object service : TestProduct.services) {
			if (service instanceof MarketingInterface) {
				this.mkService = (MarketingInterface) service;
			}
		}
		if (this.mkService == null) {
			throw new UnsupportedOperationException();
		}
	}
	
	public Product (MarketingInterface mkService, ValidatorInterface validatorService) {
		this.setMarketingStrategy(mkService);
		if (validatorService == null) {
			throw new NullPointerException();
		}
		this.validatorService = validatorService;
	}
	
	public void setMarketingStrategy(MarketingInterface mkService) {
		if (mkService == null) {
			throw new NullPointerException();
		}
		this.mkService = mkService;
	}
	
	public static float getPriceWithDiscount(float initialPrice, float discountValue) {
		return initialPrice - (discountValue * initialPrice);
	}
	
	public float getFinalPrice (ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException {
		validatorService.validatePrice(initialPrice);
		validatorService.validateAccountAge(accountAgeInYears);
		
	    float fidelityDiscount = (productType == ProductType.NEW) ? 
	    							0 : mkService.getFidelityDiscount(accountAgeInYears);
	    
	    float discountValue = productType.getDiscount();
    	float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
    	float finalPrice = priceWithDiscount * (1 - fidelityDiscount);

	    return finalPrice;
	  }
}