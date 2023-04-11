package MDA;
import MDA.State.*;

public class MDA_EFSM {
	
	public int k = 0;
	public int[] A;
	
	private State S;
	private State[] LS;
	
	public MDA_EFSM() {
		
	}
	
	public void changeState(int s) {
		S = LS[s];
		System.out.println("New state: "+ S.toString());
	}
	
	public void create() {
		
	}
	
	public void insert_cups(int n) {
		
	}
	
	public void coin(int f) {
		
	}
	
	public void card() {
		
	}
	
	public void cancel() {
		
	}
	
	public void set_price() {
		
	}
	
	public void dispose_drink(int d) {
		
	}
	
	public void additive(int a) {
		
	}
}
