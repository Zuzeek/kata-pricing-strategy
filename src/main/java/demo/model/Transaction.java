package demo.model;

public abstract class Transaction {
	
	private String sku; 
	private Screen screen; 

	public Transaction(String sku, Screen screen) {
		this.sku = sku;
		this.screen = screen;
	}

	public String getSku() {
		return sku;
	}

	public Screen getScreen() {
		return screen;
	}
	
	abstract public void execute(); // perform transactions -> overriden by subclasses 
	
	
}
