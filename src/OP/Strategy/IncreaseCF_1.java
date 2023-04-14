package OP.Strategy;

import DataStore.DataStore;

public class IncreaseCF_1 extends IncreaseCF {
	private DataStore ds;
	
	public IncreaseCF_1(DataStore ds) {
		this.ds = ds;
	}
	
	public DataStore getDataStore() {
		return this.ds;
	}
	
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void increaseCF() {
		float cf = ds.getCF1();
		float v = ds.getTemp_v1();
		ds.setCF(cf + v);
		System.out.println("CF: " + ds.getCF1());
	}
	
}
