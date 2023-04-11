package VM;
import MDA.*;
import DataStore.*;

public class VM_1 {

	private MDA_EFSM m;
	private DS_1 d;
	
	public VM_1(MDA_EFSM m) {
		this.m = m;
		this.d = new DS_1();
	}
	
	public void create(int p) {
		d.setTemp_p(p);
		m.create();
	}
	
	public void coin(float v) {
		d.setTemp_v(v);
		if(d.getCF() + v >= d.getPrice()) {
			m.coin(1);
		} else {
			m.coin(0);
		}
	}
	
	public void sugar() {
		m.additive(1);
	}
	
	public void tea() {
		m.dispose_drink(1);
	}
	
	public void latte() {
		m.dispose_drink(2);
	}
	
	public void insert_cups(int n) {
		m.insert_cups(n);
	}
	
	public void set_price(float p) {
		d.setTemp_p(p);
		m.set_price();
	}
	
	public void cancel() {
		m.cancel();
	}
}
