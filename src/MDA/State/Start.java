package MDA.State;
import MDA.*;
import OP.*;

public class Start extends State {

	
	public Start(MDA_EFSM m, OP op) {
		super(m, op);
	}
	
	public void create() {
		op.storePrice();
		m.changeState(1);
	}
	
	public String toString() {
		return "Start state";
	}
}
