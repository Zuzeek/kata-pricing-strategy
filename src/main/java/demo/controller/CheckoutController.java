package demo.controller;

import demo.model.Screen;
import demo.model.UserInput;
import demo.service.CheckoutService;
import demo.service.ItemService;
import demo.service.PricingSchemeService;

public class CheckoutController {
	
	private String sku; 
	private Double unitPrice; 
	private Double specialPrice; 
	
	private Screen screen; 
	private UserInput userInput; 
	private ItemService itemService; 
	private PricingSchemeService pricingSchemeService; 
	private CheckoutService checkoutService; 
	private PriceManager priceManager;
	
	public CheckoutController() {
		screen = new Screen(); 
		userInput = new UserInput();
		itemService = new ItemService(); 
		pricingSchemeService = new PricingSchemeService(); 
		checkoutService = new CheckoutService(); 
	}
	
	public void run() {
		screen.displayMessageLine("\nWelcome!");
		performAction(); 
		screen.displayMessageLine("\nGoodbye!");
	}

	private void performAction() {
		
		
	}
	
	
	
}
