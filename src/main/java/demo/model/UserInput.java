package demo.model;

import java.util.Scanner;

public class UserInput {
	
	private static final String REGEX_SKU = "^[\\D]$"; 
	private static final String REGEX_INT = "^[\\d*d]\\d+$"; 
	
	private Scanner sc; 
	private Screen screen; 
	
	public UserInput() {
		sc = new Scanner(System.in); 
	}
	
	public String getSkuInput() {
		// loop until user inputs sku 
		do {
			screen.displayMessageLine("Incorrect SKU, enter correct SKU");
			return sc.nextLine();
		}
		while(!sc.hasNext(REGEX_SKU)); 
	}
	
	public int getIntInput() {
		do {
			screen.displayMessageLine("Not a number, enter correct value");
			return sc.nextInt();
		}
		while (!sc.hasNext(REGEX_INT));
	}
	

}
