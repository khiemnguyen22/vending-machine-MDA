package VM;
import MDA.*;
import DataStore.*;

// vending machine 2
public class VM_2 {
	
	private MDA_EFSM m;
	private DataStore d;
	
	public VM_2(MDA_EFSM m, DataStore d) {
		this.m = m;
		this.d = d;
	}
	
	public void CREATE(float p) {
		d.setTemp_p(p);
		m.create();
	}
	
	public void COIN(int v) {
		d.setTemp_v(v);
		if(d.getCF2() + v >= d.getPrice()) {
			m.coin(1);
		} else {
			m.coin(0);
		}
	}
	
	public void SUGAR() {
		m.additive(2);
	}

	public void CREAM() {
		m.additive(1);
	}
	
	public void COFFEE() {
		m.dispose_drink(1);
	}
	
	public void InsertCups(int n) {
		m.insert_cups(n);
	}
	
	public void SetPrice(float p) {
		d.setTemp_p(p);
		m.set_price();
	}
	
	public void CANCEL() {
		m.cancel();
	}
	
	public void CARD(int x) {
		if(x >= d.getPrice()) {
			m.card();
		}
	}
}
