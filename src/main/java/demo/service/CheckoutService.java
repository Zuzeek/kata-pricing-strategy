package demo.service;

public class CheckoutService {
	
	private ItemService itemServie; 
	private PricingSchemeService pricingSchemeService;
	private PriceManagerService priceManagerService; 
	private BasketService basketService; 
		
	public CheckoutService() {
		itemServie = new ItemService();
		pricingSchemeService = new PricingSchemeService();
		priceManagerService = new PriceManagerService();
	}

	public void checkout() {
		itemServie.addItem();
		pricingSchemeService.addPricingScheme();
		basketService.addItem();
		priceManagerService.getTotalPrice();
	}
	
	
}
