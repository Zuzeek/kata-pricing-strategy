package demo.controller;

import demo.model.Screen;
import demo.service.CheckoutService;

public class CheckoutController {
	
	private Screen screen; 
	private CheckoutService checkoutService; 
	
	public CheckoutController() {
		screen = new Screen(); 
		checkoutService = new CheckoutService(); 
	}
	
	public void run() {
		screen.displayMessageLine("\nWelcome!");
		performAction(); 
		screen.displayMessageLine("\nGoodbye!");
	}

	private void performAction() {
		checkoutService.checkout();		
	}
	
	
	
}
