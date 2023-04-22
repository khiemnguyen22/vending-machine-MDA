package MDA.State;

import MDA.MDA_EFSM;
import OP.OP;

public abstract class State {
	
	protected MDA_EFSM m;
	protected OP op; 
	
	public abstract void create();
	
	public abstract void insert_cups(int n);
	
	public abstract void coin(int f);
	
	public abstract void card();
	
	public abstract void cancel();
	
	public abstract void set_price();
	
	public abstract void dispose_drink(int d);
	
	public abstract void additive(int a);
	
	public String toString() {
		return "Default state";
	}
}
