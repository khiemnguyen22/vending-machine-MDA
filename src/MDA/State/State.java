package MDA.State;

import MDA.MDA_EFSM;
import OP.OP;

public class State {
	
	protected MDA_EFSM m;
	protected OP op; 
	
	public State(MDA_EFSM m, OP op) {
		this.m = m;
		this.op = op;
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
	
	public String toString() {
		return "Default state";
	}
}
