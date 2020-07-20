package demo.model;

public class PricingScheme {
	
	private String sku; 
	private int quantity; 
	private Double specialPrice;
	
	public PricingScheme() {}
	
	public PricingScheme(String sku, int quantity, Double specialPrice) {
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
	
	public Double getSpecialPrice() {
		return specialPrice;
	}
	
	public void setSpecialPrice(Double specialPrice) {
		this.specialPrice = specialPrice;
	} 
	
	
}
