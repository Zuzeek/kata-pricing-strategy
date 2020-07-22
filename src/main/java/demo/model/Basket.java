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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basket other = (Basket) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	} 
	
	
}
