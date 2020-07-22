package demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import demo.model.Item;
import demo.model.PricingScheme;
import demo.model.Screen;

public class PriceManagerService {

	private double totalPrice; 
	private Screen screen; 
	
	private ItemService itemService; 
	private PricingSchemeService pricingSchemeService; 
	private BasketService basketService; 
	private Item item; 
		
	private List<String> itemsInBasket; 
	private List<Item> availableItems; 
	private List<PricingScheme> availableScheme; 
	
	public PriceManagerService() {
		this.totalPrice = 0.0; 
		itemsInBasket = new ArrayList<>(); 
	}
	
	public void getTotalPrice() {
		getAvailableItems();
		getAvailablePricingStrategy();
		basketService.addItem();
		
		
	}
	
	public Map<Object, Long> fetchItemsOccuranceInBasket() {
		return basketService.getItemsInBasket()
				.stream()
				.collect(
					Collectors.groupingBy(item -> item
							.toString()
							.toLowerCase(),
					Collectors.counting()));

	}
	
	public double getPrice(Item scannedItem, PricingScheme pricingScheme) {
		getAvailableItems();
		int occurences = Collections.frequency(itemsInBasket, scannedItem.getSku()); // return number of occurences of the sku
		
		
		return totalPrice; 
	}

	public double getTotalRunningPrice(Item scannedItem) {
		totalPrice += scannedItem.getUnitPrice(); 
		return totalPrice / 100; // to get price in GBP 
	}
	
	public void getAvailableItems() {
		itemService = new ItemService(); 
		availableItems = itemService.getItems(); 
	}
	
	public void getAvailablePricingStrategy() {
		pricingSchemeService = new PricingSchemeService(); 
		availableScheme = pricingSchemeService.getPricingSchemeList(); 
	}

	public boolean isMultipriced(String sku) {

		return true;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public double getTotalPrice(Item scannedItem) {		
//		double totalPrice = 0.0; 
//		
//		for (int i = 0; i < basketService.getTotalItemsInBasket(); i++) {
//			
//			!pricingScheme.equals(null) && 
//			
//			if(scannedItem.getSku().equals(pricingScheme.getSku())) {
//				if() {
//					double specialPrice = scannedItem.getUnitPrice() * (pricingScheme.getQuantity() - 1);
//				}
//			}
//			else {
//				screen.displayMessageLine("input valid item");
//			}
//		}
//			
//	}
//
//	public double getTotalRunningPrice(Item scannedItem, PricingScheme pricingScheme) {
//		runningPrice = 0.0; 
//		for(int i = 0; i < getTotalItemsInBasket(); i++) {
//			basketItems = 
//		}
//		
//		runningPrice += scannedItem.getUnitPrice(); 
//		return runningPrice;
//	}
//	
//	public void refreshRunningTotalPrice() {
//		
//	}
//	
//	public double getTotalCost() {
//	    double totalPrice = 0.0;
//	    for (int i = 0; i < basketService.getTotalItemsInBasket(); i++) {
//	    	Item item = basketService.getItemsInBasket().get(i); 
//	    	totalPrice += item.getUnitPrice() * item.getQuantity();
//	    }
//	    return totalPrice;
//	}

