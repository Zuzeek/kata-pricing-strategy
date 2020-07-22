package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Screen;
import demo.model.UserInput;

public class BasketService {
		
	private static final String CANCELED = "exit"; 
	private String sku; 
	
	private Screen screen; 
	private UserInput userInput;
	
	private List<String> basketItems; 

	
	public BasketService() {
		screen = new Screen(); 
		userInput = new UserInput(); 
		basketItems = new ArrayList<>();
	}
	
	public void addItem() {
		while(true) {
			screen.displayMessageLine("Enter item to add to basket or type 'exit' to stop:\nEnter item sku: ");
			sku = userInput.getStringInput();
			
			if(!sku.equalsIgnoreCase(CANCELED)) {
					addItemToBasket(sku);
			}
			else {
				screen.displayMessageLine("\nCanceling...");
				return; // return to main menu
			}
		}
	}
	
	private void addItemToBasket(String sku) {
		basketItems.add(sku); 
	}
	
	public List<String> getItemsInBasket(){
		return basketItems; 
	}
	
	public int getTotalItemsInBasket() {
		return basketItems.size(); 
	}
	
}
