package demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import demo.model.Item;
import demo.service.ItemService;

public class TestItemService {
	
	ItemService itemService = new ItemService(); 
	
	@Test
	public void givenItemIsValidaWhenAddedToTheListThenReturnEquals() {
		itemService.addItemToList("A", 50);
		itemService.addItemToList("B", 30);
		
		List<Item> items = itemService.getItems(); 
		
		assertEquals(items.get(0).getSku(), "A");
		assertEquals(items.get(1).getSku(), "B"); 
	}

}
