package demo.model;

public class PricingScheme {
	
	private String sku; 
	private int quantity; 
	private int specialPrice;
	
	public PricingScheme() {}
	
	public PricingScheme(String sku, int quantity, int specialPrice) {
		this.sku = sku;
		this.quantity = quantity;
		this.specialPrice = specialPrice;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getSpecialPrice() {
		return specialPrice;
	}
	
	public void setSpecialPrice(int specialPrice) {
		this.specialPrice = specialPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantity;
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		result = prime * result + specialPrice;
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
		PricingScheme other = (PricingScheme) obj;
		if (quantity != other.quantity)
			return false;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		if (specialPrice != other.specialPrice)
			return false;
		return true;
	} 
	
	
}
