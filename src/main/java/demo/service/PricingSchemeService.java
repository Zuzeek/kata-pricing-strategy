package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Item;
import demo.model.PricingScheme;
import demo.model.Screen;
import demo.model.UserInput;

public class PricingSchemeService {
	
	private String sku; 
	private int quantity;
	private int specialPrice; 
	
	private List<PricingScheme> pricingSchemeItems; 
	private PricingScheme pricingScheme; 
	private Item item; 
	Screen screen; 
	UserInput userInput;
	
	private static final String CANCELED = "stop"; 
	
	public PricingSchemeService() {
		pricingSchemeItems = new ArrayList<>(); 
		item = new Item();
		screen = new Screen(); 
		userInput = new UserInput();		
	}
	
	public void addPricingScheme(){
		while(true) {
			screen.displayMessageLine("Enter pricing scheme:\nEnter item sku: ");
			sku = userInput.getSkuInput(); 
			
			if(!sku.equalsIgnoreCase(CANCELED)) {
				if(item.validateSku(sku)) {
					
					screen.displayMessageLine("\nEnter quantity: ");
					quantity = userInput.getIntInput(); 
					
					screen.displayMessageLine("\nEnter price (in Pence): ");
					specialPrice = userInput.getIntInput(); 
					
					addPricingSchemeToList(sku, quantity, specialPrice);
				}
				else {
					screen.displayMessage("Item does not exists.\nEnter existing item or type 'stop'.");
				}
			}
			else {
				screen.displayMessageLine("\nCanceling...");
				return; // return to main menu
			}
		} 
	}

	private void addPricingSchemeToList(String sku, int quantity, int specialPrice) {
		pricingScheme = new PricingScheme(sku, quantity, specialPrice); 
		pricingSchemeItems.add(pricingScheme);
	}

	public PricingScheme isMulitpriced(String sku) {

		return null;
	}
	
	public List<PricingScheme> getPricingSchemeList() {
		return pricingSchemeItems; 
	}
}
