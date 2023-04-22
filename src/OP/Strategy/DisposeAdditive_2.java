package OP.Strategy;

public class DisposeAdditive_2 extends DisposeAdditive {
	public void disposeAdditive(int[] A) {
		if (A[1] == 1) {
			System.out.println("Add cream");
		} 
		if(A[2] == 1) {
			System.out.println("Add sugar");
		}
	}

}
