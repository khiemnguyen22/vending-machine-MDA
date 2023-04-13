package OP.Strategy;

import DataStore.DataStore;

public class StorePrice_2 {
	private DataStore ds;
	
	public StorePrice_2(DataStore ds) {
		this.ds = ds;
	}
	
	public DataStore getDataStore() {
		return ds;
	}
	
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void storePrice() {
		float price = ds.getPrice();
		ds.setPrice(price);
		System.out.println("Item price: " + ds.getPrice());
	}
}
