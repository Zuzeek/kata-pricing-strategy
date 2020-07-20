package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.model.Item;
import demo.model.Screen;
import demo.model.UserInput;

public class ItemService {
	
	private List<Item> items;  
	private UserInput userInput; 
	private Screen screen; 
	private Item item; 
	
	public ItemService() {
		items = new ArrayList<>();
		screen = new Screen(); 
		userInput = new UserInput(); 
		item = new Item(); 
	}
		
	public void addItem() {
		screen.displayMessageLine("Enter new item.\nEnter item sku: ");
		String sku = userInput.getSkuInput(); 
		
		if(!itemExists(sku)) {
			screen.displayMessageLine("\nEnter price for: " + sku + " in Pence: ");
			double unitPrice = userInput.getIntInput(); 
			addItemToList(sku, unitPrice);
		}
		else {
			screen.displayMessage("Item with SKU " + item.getSku() + " already exists.\nEnter new item or press exit.");
			return; // exiting
		}
	}

	private void addItemToList(String sku, double unitPrice) {
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
			if (sku.equals(temp.getSku())) {
				item = temp; 
			}
		}
		return item;
	}	
	
	public List<Item> getItems(){
		return items; 
	}
	
	public double getItemUnitPrice(String sku) {
		return getItem(sku).getUnitPrice(); 
	}
}
