package OP.Strategy;

import DataStore.DataStore;

public class ReturnCoins_1 extends ReturnCoins{
	private DataStore ds;
	
	
	public DataStore getDataStore() {
		return this.ds;
	}
	
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void returnCoins() {
		System.out.print("Return coin inserted: ");
	}
	

}
