package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Item;
import demo.model.PricingScheme;
import demo.model.Screen;
import demo.model.UserInput;

public class PricingSchemeService {
	
	private List<PricingScheme> pricingSchemeItems = new ArrayList<>(); 
	private Item item; 
	private Screen screen; 
	private UserInput userInput; 
	
	private static final String CANCELED = "exit"; 
	
	public List<PricingScheme> getPricingSchemeList() {
		return pricingSchemeItems; 
	}
	
	public void addPricingScheme(String sku, int quantity, double specialPrice) {
		screen.displayMessageLine("Enter pricing scheme.\nEnter item sku: ");
		userInput.getSkuInput(); 
		
		PricingScheme availableScheme = isMulitpriced(sku); 
		
		// loop until user cancel's 
		do {
			// check if available sku 
			if(!userInput.getSkuInput().equals(null)) {
				
			}
			
			
			return; // return to main menu 
		} while (!userInput.getSkuInput().equalsIgnoreCase(CANCELED)); 
	
	}

	public PricingScheme isMulitpriced(String sku) {

		return null;
	}
}
