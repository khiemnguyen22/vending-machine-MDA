package MDA.State;
import MDA.*;
import OP.*;

public class Start extends State {

	
	public Start(MDA_EFSM m, OP op) {
		this.m = m;
		this.op = op;
	}
	
	public void create() {
		op.storePrice();
		m.changeState(1);
	}
	
	public void card() {
		
	}
	
	public void set_price() {
		
	}
	
	public void insert_cups(int n) {
		
	}
	
	public void cancel() {
		
	}
	
	public void additive(int a) {
		
	}
	
	public void coin(int f) {
		
	}
	
	public void dispose_drink(int d) {
		
	}
	
	public String toString() {
		return "Start state";
	}
}
