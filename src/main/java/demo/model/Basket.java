package demo.model;

public class Basket {
	
	private final Item item; 
	private int quantity;
	
	public Basket(Item item, int quantity) {
		this.item = new Item();
		this.quantity = quantity;
	}

	public int addItem() {
		return quantity += 1; 
	}
	
	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	} 
	
	
}
