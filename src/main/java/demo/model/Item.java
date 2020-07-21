package demo.model;

public class Item {
	
	private String sku; 
	private Double unitPrice;
		
	public Item() {}

	public Item(String sku, Double unitPrice) {
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

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	} 
	
	
}
