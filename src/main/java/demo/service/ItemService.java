package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Item;
import demo.model.Screen;
import demo.model.UserInput;

public class ItemService {
	
	private String sku; 
	private int unitPrice; 
	
	private List<Item> items;  
	private UserInput userInput; 
	private Screen screen; 
	private Item item; 
	
	private static final String CANCELED = "exit"; 
	
	public ItemService() {
		items = new ArrayList<>();
		screen = new Screen(); 
		userInput = new UserInput(); 
		item = new Item(); 
	}
		
	public void addItem() {
		while(true) {
			screen.displayMessageLine("Enter new item or type 'exit' to stop.\nEnter item sku: ");
			sku = userInput.getStringInput();
			
			if(!sku.equalsIgnoreCase(CANCELED)) {
				
				if(!itemExists(sku)) {
					screen.displayMessageLine("\nEnter price for: " + sku + " in Pence: ");
					unitPrice = userInput.getIntInput(); 
					addItemToList(sku, unitPrice);
				}
				else {
					screen.displayMessage("Item with SKU " + item.getSku() + " already exists..");
				}
			}
			else {
				screen.displayMessageLine("\nCanceling...");
				return; // return to main menu
			}
		} 
	}
	
	public void addItemToList(String sku, int unitPrice) {
		item = new Item(sku, unitPrice); 
		items.add(item); 		
	}

	// validate if item exists 
	public boolean itemExists(String sku) {
		item = getItem(sku);
		
		if(item != null) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	// fetch item object 
	public Item getItem(String sku) {
		item = null; 
		
		for(Item temp: items) {
			if (sku.equalsIgnoreCase(temp.getSku())) {
				item = temp; 
			}
		}
		return item;
	}	
	
	public List<Item> getItems(){
		return items; 
	}
	
	public int getItemUnitPrice(String sku) {
		return getItem(sku).getUnitPrice(); 
	}
	
	
	
}
