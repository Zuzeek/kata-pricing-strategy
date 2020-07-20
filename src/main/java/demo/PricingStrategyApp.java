package demo;

import demo.controller.CheckoutController;
import demo.service.ItemService;

public class PricingStrategyApp {
    public static void main(String[] args) {
//    	CheckoutController theCheckout = new CheckoutController(); 

    	ItemService itemService = new ItemService(); 
    	itemService.addItem();
    }
}
