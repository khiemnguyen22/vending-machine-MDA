package OP.Strategy;
import DataStore.DataStore;


public abstract class StorePrice {
	public abstract DataStore getDataStore();
	
	public abstract void setDataStore(DataStore ds);
	
	public abstract void storePrice();
	
}
