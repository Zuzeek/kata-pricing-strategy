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
	
	
}
