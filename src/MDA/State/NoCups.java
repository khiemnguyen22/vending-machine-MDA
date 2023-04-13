package MDA.State;

import MDA.MDA_EFSM;
import OP.OP;

public class NoCups extends State {
	
	private MDA_EFSM m;
	private OP op;
	
	public NoCups(MDA_EFSM m, OP op) {
		this.m = m;
		this.op = op;
	}
	
	public void coin(int f) {
		op.returnCoins();
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
