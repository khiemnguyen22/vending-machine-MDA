package AbstractFactory;

import DataStore.*;
import OP.Strategy.*;

public class CF2 extends AF{
	public DataStore getDataStore() {
		return new DS_2();
	}

	public StorePrice getStorePrice() {
		return new StorePrice_2();
	}
	
	public ZeroCF getZeroCF() {
		return new ZeroCF1();
	}
	
	public IncreaseCF getIncreaseCF() {
		return new IncreaseCF_2();
	}
	
	public ReturnCoins getReturnCoins() {
		return new ReturnCoins_1();
	}
	
	public DisposeDrink getDisposeDrink() {
		return new DisposeDrink_2();
	}
	
	public DisposeAdditive getDisposeAdditive() {
		return new DisposeAdditive_2();
	}
}
