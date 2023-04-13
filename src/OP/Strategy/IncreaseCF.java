package OP.Strategy;

import DataStore.DataStore;

public abstract class IncreaseCF {
	public abstract DataStore getDataStore();
	
	public abstract void setDataStore(DataStore ds);
	
	public abstract void increaseCF();
}
