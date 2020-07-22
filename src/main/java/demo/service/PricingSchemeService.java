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
	
	private List<PricingScheme> pricingSchemeList; 
	private PricingScheme pricingScheme; 
	private ItemService itemService; 
	
	Screen screen; 
	UserInput userInput;
	
	private static final String CANCELED = "exit"; 
	
	public PricingSchemeService() {
		pricingSchemeList = new ArrayList<>(); 
		pricingScheme = new PricingScheme(); 
		screen = new Screen(); 
		userInput = new UserInput();		
	}
	
	public void addPricingScheme(){
		while(true) {
			screen.displayMessageLine("Enter pricing scheme or type 'exit' to stop:\nEnter item sku: ");
			sku = userInput.getStringInput(); 
			
			if(!sku.equalsIgnoreCase(CANCELED)) {
				if(!pricingSchemeExists(sku)) {
					
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
	
	public boolean pricingSchemeExists(String sku) {
		pricingScheme = getScheme(sku); 
		
		if (pricingScheme != null) {
			return true; 
		}
		else
			return false; 
	}

	// fetch scheme obj 
	private PricingScheme getScheme(String sku) {
		pricingScheme = null; 
		
		for (PricingScheme temp: pricingSchemeList) {
			if(sku.equalsIgnoreCase(temp.getSku())) {
				pricingScheme = temp; 
			}
		}
		return pricingScheme;
	}

	private void addPricingSchemeToList(String sku, int quantity, int specialPrice) {
		pricingScheme = new PricingScheme(sku, quantity, specialPrice); 
		pricingSchemeList.add(pricingScheme);
	}

	public List<PricingScheme> getPricingSchemeList() {
		return pricingSchemeList; 
	}
	
}
