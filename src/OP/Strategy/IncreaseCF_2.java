package OP.Strategy;

import DataStore.DataStore;

public class IncreaseCF_2 extends IncreaseCF {
	private DataStore ds;
	
	
	public DataStore getDataStore() {
		return this.ds;
	}
	
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void increaseCF() {
		int cf = ds.getCF2();
		int v = ds.getTemp_v2();
		ds.setCF(cf + v);
		System.out.println("CF: " + ds.getCF2());
	}
	
}
