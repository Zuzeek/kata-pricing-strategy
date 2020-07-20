package demo.model;

public class Screen {
	
	public void displayMessage(String message) {
		System.out.print(message);
	}
	
	public void displayMessageLine(String message) {
		System.out.println(message);
	}
	
	public void displayGbpAmount(double amount) {
		System.out.printf("£%,2.f", amount);
	}
}
