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
		System.out.println("From StorePrice1, temp price: " + ds.getTemp_p());
		float price = ds.getTemp_p();
		ds.setPrice(price);
		System.out.println("Stored. Item price: " + ds.getPrice());
	}

}
