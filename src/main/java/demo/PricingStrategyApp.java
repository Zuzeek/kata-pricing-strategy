package demo;

import demo.controller.CheckoutController;
import demo.service.BasketService;
import demo.service.PriceManagerService;

public class PricingStrategyApp {
    public static void main(String[] args) {
    	
    	CheckoutController checkoutController = new CheckoutController();
    	checkoutController.run();
    	
    	
    }
}
