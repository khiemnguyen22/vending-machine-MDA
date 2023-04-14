package OP.Strategy;

import DataStore.DataStore;

public class StorePrice_2 extends StorePrice {
	private DataStore ds;
	
	
	public DataStore getDataStore() {
		return ds;
	}
	
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void storePrice() {
		float price = ds.getTemp_p();
		ds.setPrice(price);
		System.out.println("Stored. Item price: " + ds.getPrice());
	}
}
