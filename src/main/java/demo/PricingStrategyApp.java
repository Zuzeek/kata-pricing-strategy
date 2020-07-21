package demo;

import java.util.ArrayList;
import java.util.List;

import demo.controller.CheckoutController;
import demo.model.PricingScheme;
import demo.model.Screen;
import demo.model.UserInput;
import demo.service.ItemService;
import demo.service.PricingSchemeService;

public class PricingStrategyApp {
    public static void main(String[] args) {
//    	CheckoutController theCheckout = new CheckoutController(); 

//    	ItemService itemService = new ItemService(); 
//    	itemService.addItem();
    	
    	UserInput userInput = null;
		Screen screen = null;
		List<PricingScheme> pricingSchemeItems = new ArrayList<>();
		
		PricingSchemeService pricingSchemeService = new PricingSchemeService(); 
    	pricingSchemeService.addPricingScheme();
    }
}
