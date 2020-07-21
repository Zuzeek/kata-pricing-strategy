package demo;

import org.junit.Test;

import demo.model.Item;
import demo.model.PricingScheme;

public class TestPricingManager {

	Item itemA = new Item("A", 50); 
	Item itemB = new Item("B", 30); 
	PricingScheme pricingSchemeA = new PricingScheme("A", 3, 130); 
	PricingScheme pricingSchemeB = new PricingScheme("B", 2, 45); 

	@Test
	public void test() {
		
	}

}
