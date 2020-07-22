package demo.service;

public class CheckoutService {
	
	private ItemService itemServie; 
	private PricingSchemeService pricingSchemeService;
	private BasketService basketService; 
	private PriceManagerService priceManagerService; 
		
	public CheckoutService() {
		itemServie = new ItemService();
		pricingSchemeService = new PricingSchemeService();
		basketService = new BasketService(); 
		priceManagerService = new PriceManagerService();
	}

	public void checkout() {
		itemServie.addItem();
		pricingSchemeService.addPricingScheme();
		basketService.addItem();
		priceManagerService.getTotalPrice();
	}
	
	
}
