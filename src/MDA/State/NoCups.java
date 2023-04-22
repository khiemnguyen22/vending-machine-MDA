package MDA.State;

import MDA.MDA_EFSM;
import OP.OP;

public class NoCups extends State {
	
	
	public NoCups(MDA_EFSM m, OP op) {
		this.m = m;
		this.op = op;
	}
	
	public void card() {
		
	}
	
	public void set_price() {
		
	}
	
	public void dispose_drink(int d) {
		
	}
	
	public void additive(int a) {
		
	}
	
	public void create() {
		
	}
	
	public void cancel() {
		
	}
	
	public void coin(int f) {
		op.returnCoins();
//		System.out.println(f);
	}
	
	public void insert_cups(int n) {
		if (n > 0) {
			m.k = n;
			op.zeroCF();
			m.changeState(2);
			System.out.println("Cup inserted: "+ n);
		} else {
			System.out.println("Invalid cup: "+ n);
		}
	}
	
	public String toString() {
		return "No cups state";
	}
}
