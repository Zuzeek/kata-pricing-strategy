package demo.service;

import demo.model.Screen;
import demo.model.UserInput;

public class BasketService {
	
	private ItemService itemService; 
	private Screen screen; 
	private UserInput userInput; 
	
	private final static int CANCELED = 1; 
	
	public BasketService() {
		itemService = new ItemService();
		screen = new Screen(); 
		userInput = new UserInput(); 
	}

	public void totalRunningPrice() {
		
	}
	
	public void addToBasket() {
	
		
	}
	
}
