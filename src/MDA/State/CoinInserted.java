package MDA.State;

import MDA.MDA_EFSM;
import OP.OP;

public class CoinInserted extends State {
	private MDA_EFSM m;
	private OP op;
	
	public CoinInserted(MDA_EFSM m, OP op) {
		this.m = m;
		this.op = op;
	}
	
	public void cancel() {
		op.returnCoins();
		op.zeroCF();
		m.changeState(2);
	}
	
	public void coin(int f) {
		op.returnCoins();
		System.out.println(f);
	}
	
	public void additive(int a) {
		if (m.A[a] == 0) {
			m.A[a] = 1;
		} else {
			m.A[a] = 0;
		}
	}
	
	public void dispose_drink(int d) {
		if (m.k > 1) {
			op.disposeDrink(d);
			op.disposeAdditive(m.A);
			m.k--;
			System.out.println("Remaining cup: "+ m.k);
			op.zeroCF();
			m.changeState(2);
		} else {
			op.disposeDrink(d);
			op.disposeAdditive(m.A);
			m.changeState(1);
		}
	}
	
	public String toString() {
		return "Coin inserted state";
	}
}
