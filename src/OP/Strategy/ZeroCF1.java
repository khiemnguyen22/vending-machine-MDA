package OP.Strategy;

import DataStore.DataStore;

public class ZeroCF1 extends ZeroCF {

	private DataStore ds;
	
	public ZeroCF1(DataStore ds) {
		this.ds = ds;
	}
	
	public DataStore getDataStore() {
		return this.ds;
	}
	
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void zeroCF() {
		ds.setCF(0);
		System.out.println("Set CF to 0");
	}
}
