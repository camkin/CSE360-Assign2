package cse360assign2;

public class AddingMachine {

	private int total;
	
	//Used for history of transactions
	private String history;

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = new String("0");
		
	}
	
	public int getTotal () {
		System.out.print("test test test");
		//iii. Return current total
		return total;
	}
	
	public void add (int value) {
		
		//i. Add method should add the parameter to the total variable
		total = total + value;
		
	}
	
	public void subtract (int value) {
		
		//ii. Subtract the parameter from the total variable
		total = total - value;
	}
		
	public String toString () {
		return history.toString();
	}

	public void clear() {
	
	}
}
