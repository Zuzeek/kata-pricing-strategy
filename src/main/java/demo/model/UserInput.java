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
	
	public String getStringInput() {
		return sc.next();
	}
	
	public int getIntInput() {
		return sc.nextInt();
	}
	
}
