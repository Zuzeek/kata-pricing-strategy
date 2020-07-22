package demo.model;

public class Item {
	
	private String sku; 
	private int unitPrice;
		
	public Item() {}

	public Item(String sku, int unitPrice) {
		this.sku = sku;
		this.unitPrice = unitPrice;
	}

	// -> move logic to service 
	public boolean validateSku(String userSku) {
		if(userSku == sku) 
			return true;
		else 
			return false; 
	}
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		result = prime * result + unitPrice;
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
		Item other = (Item) obj;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		if (unitPrice != other.unitPrice)
			return false;
		return true;
	} 
	
	
}
