package OP.Strategy;

public class DisposeDrink_1 extends DisposeDrink {
	
	public void disposeDrink(int d) {
		if (d == 1) {
			System.out.println("Dispose tea");
		} else if (d == 2) {
			System.out.println("Dispose latte");
		} else {
			System.out.println("Invalid drink");
		}
		
	}
	

}
