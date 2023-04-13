package MDA.State;
import MDA.*;
import OP.*;

public class Start extends State {

	private MDA_EFSM m;
	private OP op;
	
	public Start(MDA_EFSM m, OP op) {
		this.m = m;
		this.op = op;
	}
	
	public void create() {
		op.storePrice();
		m.changeState(1);
	}
	
	public String toString() {
		return "Start state";
	}
}
