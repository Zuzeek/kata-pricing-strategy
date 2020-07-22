package demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo.model.Basket;
import demo.model.Item;
import demo.model.PricingScheme;
import demo.model.Screen;
import demo.model.UserInput;

public class BasketService {
		
	private static final String CANCELED = "exit"; 
	private String sku; 
	
	private List<Basket> basketItems = new ArrayList<>(); 
	
	private ItemService itemService; 
	private PricingSchemeService pricingSchemeService; 
	private Screen screen; 
	private UserInput userInput; 
	
	private List<String> scannedItems; 
	private List<Item> availableItems; 
	private List<PricingScheme> availableScheme; 
	
	public BasketService() {
		scannedItems = new ArrayList<>();
		availableItems = new ArrayList<>();
		availableScheme = new ArrayList<>(); 
	}
	
	public void addItem() {
		while(true) {
			screen.displayMessageLine("Enter item to add to basket or type 'exit' to stop:\nEnter item sku: ");
			sku = userInput.getStringInput();
			
			if(!sku.equalsIgnoreCase(CANCELED)) {
				if(itemService.itemExists(sku)) {
					addItemToBasket(sku);
				}
				else {
					screen.displayMessage("Item with SKU does not exists.\nEnter new item or press 'stop' to Cancel.");
				}
			}
			else {
				screen.displayMessageLine("\nCanceling...");
				return; // return to main menu
			}
		}
	}
	
	private void addItemToBasket(String sku) {
		scannedItems.add(sku); 
	}
	
	public List<String> getItemsInBasket(){
		return scannedItems; 
	}
	
	public int getTotalItemsInBasket() {
		return basketItems.size(); 
	}
	
}
