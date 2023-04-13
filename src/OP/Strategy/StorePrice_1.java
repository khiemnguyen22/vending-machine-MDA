package OP.Strategy;

import DataStore.*;

public class StorePrice_1 extends StorePrice {
	private DataStore ds;
	
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
