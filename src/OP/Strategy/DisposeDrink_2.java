package OP.Strategy;

public class DisposeDrink_2 extends DisposeDrink{
	public void disposeDrink(int d) {
		if (d == 1) {
			System.out.println("Dispose coffee");
		} else {
			System.out.println("Invalid drink");
		}
	}
	

}
