package OP;
import DataStore.*;
import AbstractFactory.*;
import OP.Strategy.*;

public class OP {
	private DataStore ds;
	private AF af;
	
	private StorePrice storePrice;
	private ZeroCF zeroCF;
	private ReturnCoins returnCoins;
	private IncreaseCF increaseCF;
	private DisposeDrink disposeDrink;
	private DisposeAdditive disposeAdditive;
	
	public OP(AF af, DataStore ds) {
		this.af = af;
		this.ds = ds;
		
		storePrice = af.getStorePrice();
		zeroCF = af.getZeroCF();
		returnCoins = af.getReturnCoins();
		increaseCF = af.getIncreaseCF();
		disposeDrink = af.getDisposeDrink();
		disposeAdditive = af.getDisposeAdditive();
	}
	
	public void storePrice() {
		storePrice.setDataStore(ds);
		storePrice.storePrice();
	}
	
	public void zeroCF() {
		zeroCF.setDataStore(ds);
		zeroCF.zeroCF();
	}
	
	public void increaseCF() {
		increaseCF.setDataStore(ds);
		increaseCF.increaseCF();
	}
	
	public void returnCoins() {
		returnCoins.returnCoins();
	}
	
	public void disposeDrink(int d) {
		disposeDrink.disposeDrink(d);
	}
	
	public void disposeAdditive(int[] A) {
		disposeAdditive.disposeAdditive(A);
	}
}
