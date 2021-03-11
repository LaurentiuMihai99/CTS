package ro.ase.csie.cts.seminar3.stage1;

import ro.ase.csie.cts.seminar3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;

public class Product {
	
	public static final int MAX_ACCOUNT_AGE = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float getFinalPrice (ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException
	  {
		if (initialPrice <= 0) {
			throw new InvalidPriceException("Price cannot be lower than 0");
		}
		
		if (accountAgeInYears < 0) {
			throw new InvalidAccountAgeException("Account age cannot be less than 0");
		}
		
	    float finalPrice = 0;
	    float discountValue = 0;
	    float fidelityDiscount = (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float)accountAgeInYears/100;
	    
	    switch (productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case DISCOUNT:
	    	discountValue = ProductType.DISCOUNT.getDiscount();
	    	finalPrice = (initialPrice - (discountValue * initialPrice)) 
	    		  - fidelityDiscount * (initialPrice - (discountValue * initialPrice));
	    	break;
	    case LIMITED_STOCK:
	    	discountValue = ProductType.LIMITED_STOCK.getDiscount();
	    	finalPrice = (initialPrice - (discountValue * initialPrice)) 
	    		  - fidelityDiscount * (initialPrice - (discountValue * initialPrice));
	    	break;
	    case LEGACY:
	    	discountValue = ProductType.LEGACY.getDiscount();
	    	finalPrice = (initialPrice - (discountValue * initialPrice)) 
	    		  - fidelityDiscount * (initialPrice - (discountValue * initialPrice));
	    	break;
	    default:
	    	throw new UnsupportedOperationException("The new enum symbol was not processed");
	    }
	    
	    return finalPrice;
	  }
}