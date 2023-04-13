package MDA;
import MDA.State.*;
import OP.*;

public class MDA_EFSM {
	
	public int k = 0;
	public int[] A;
	
	private State S;
	private State[] LS;
	
	public MDA_EFSM(OP op) {
		
		LS = new State[4];
		
		LS[0] = new Start(this,op);
		LS[1] = new NoCups(this,op);
		LS[2] = new Idle(this,op);
		LS[3] = new CoinInserted(this,op);
		
		S = LS[0];
		
	}
	public void changeState(int s) {
		S = LS[s];
		System.out.println("New state: "+ S.toString());
	}
	
	public void create() {
		S.create();
	}
	
	public void insert_cups(int n) {
		S.insert_cups(n);
	}
	
	public void coin(int f) {
		S.coin(f);
	}
	
	public void card() {
		S.card();
	}
	
	public void cancel() {
		S.cancel();
	}
	
	public void set_price() {
		S.set_price();
	}
	
	public void dispose_drink(int d) {
		S.dispose_drink(d);
	}
	
	public void additive(int a) {
		S.additive(a);
	}
}
