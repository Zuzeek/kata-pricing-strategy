package demo.model;

public abstract class Transaction {
	
	private UserInput userInput; 
	private Screen screen; 

	public Transaction(UserInput userInput, Screen screen) {
		this.userInput = userInput;
		this.screen = screen;
	}

	public UserInput getUserInput() {
		return userInput;
	}

	public Screen getScreen() {
		return screen;
	}
	
	abstract public void execute(); // perform transactions -> overriden by subclasses 
	
	
}
