package demo.service;

import demo.model.Screen;
import demo.model.UserInput;

public class CheckoutService {
	
	private ItemService itemServie; 
	private PricingSchemeService pricingSchemeService;
	private PriceManagerService priceManagerService; 
	private UserInput userInput; 
	private Screen screen; 
		
	public CheckoutService() {
		itemServie = new ItemService();
		pricingSchemeService = new PricingSchemeService(); 
		priceManagerService = new PriceManagerService();
	}

	public void addScannedItem() {
		itemServie.addItem();
		pricingSchemeService.addPricingScheme();
		
		while(true) {
			screen.displayMessageLine("Enter item to add to basket:\nEnter item sku: ");
			String sku = userInput.getSkuInput();
			
			if(!sku.equalsIgnoreCase("stop")) {
				if(itemServie.itemExists(sku)) {
					priceManagerService.getTotalPrice(sku);
				}
				else {
					screen.displayMessage("Item with SKU does not exists.\nEnter new item or press 'stop' to Cancel.");
				}
			}
			else {
				screen.displayMessageLine("\nCanceling...");
				break;
			}
		}
	}
}
