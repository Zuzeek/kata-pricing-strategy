package demo.service;

import java.util.ArrayList;
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
		
	private List<String> itemsInBasket; 
	private List<Item> availableItems; 
	private List<PricingScheme> availableScheme; 
	
	public PriceManagerService() {
		itemsInBasket = new ArrayList<>(); 
		availableItems = new ArrayList<>(); 
		availableScheme = new ArrayList<>(); 
	}
	
	public double getTotalPrice() {
		getAvailableItems();
		getAvailablePricingStrategy(); 
		getItemsInBasket(); 
		
		Item itemOccurance = (Item) fetchItemsOccuranceInBasket(); 
		PricingScheme schemeOccurance = fetchPricingScheme(itemOccurance); 
		
		double totalPrice = getTotalRunningPrice(itemOccurance); 
		return totalPrice; 
	}
	

	public double getTotalRunningPrice(Item scannedItem) {
		totalPrice += scannedItem.getUnitPrice(); 
		return totalPrice / 100; // to get price in GBP 
	}	 
	
	public PricingScheme fetchPricingScheme(Item inputItem) {
		PricingScheme singlePricingScheme = null; 
		
		String inputSku = inputItem.getSku(); 
		for(PricingScheme scheme: availableScheme) {
			if(scheme.getSku().equalsIgnoreCase(inputSku)){
				singlePricingScheme = scheme; 
			}
		}
		return singlePricingScheme; 
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
	
	public List<Item> getAvailableItems() {
		itemService = new ItemService(); 
		availableItems = itemService.getItems(); 
		return availableItems; 
	}
	
	public List<PricingScheme> getAvailablePricingStrategy() {
		pricingSchemeService = new PricingSchemeService(); 
		availableScheme = pricingSchemeService.getPricingSchemeList(); 
		return availableScheme;
	}

	public List<String> getItemsInBasket() {
		basketService = new BasketService(); 
		itemsInBasket = basketService.getItemsInBasket(); 
		return itemsInBasket; 
	}
	
}