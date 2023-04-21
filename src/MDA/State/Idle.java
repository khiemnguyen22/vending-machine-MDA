package MDA.State;

import MDA.MDA_EFSM;
import OP.OP;

public class Idle extends State {

	
	public Idle(MDA_EFSM m, OP op) {
		super(m, op);
	}
	
	public void coin(int f) {
		if (f == 0) {
			op.increaseCF();
		} else if(f == 1) {
			op.increaseCF();
			m.A = new int[3];
			m.changeState(3);
		}
	}
	
	
	public void insert_cups(int n) {
		if (n > 0) {
			m.k += n;
			System.out.println("New k: " +m.k);
		}
	}
	
	public void set_price() {
		op.storePrice();
		System.out.println("price stored");
	}
	
	public void card() {
		op.zeroCF();
		m.A = new int[5];
		m.changeState(3);
	}
	
	public String toString() {
		return "Idle state";
	}
}
