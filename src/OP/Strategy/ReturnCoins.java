package OP.Strategy;

import DataStore.DataStore;

public abstract class ReturnCoins {
	
	public abstract DataStore getDataStore();
	
	public abstract void setDataStore(DataStore ds);
	
	public abstract void returnCoins();
}
