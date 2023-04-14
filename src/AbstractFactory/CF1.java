package AbstractFactory;

import DataStore.*;
import OP.Strategy.*;

public class CF1 extends AF {

	public DataStore getDataStore() {
		return new DS_1();
	}

	public StorePrice getStorePrice() {
		return new StorePrice_1();
	}
	
	public ZeroCF getZeroCF() {
		return new ZeroCF1();
	}
	
	public IncreaseCF getIncreaseCF() {
		return new IncreaseCF_1();
	}
	
	public ReturnCoins getReturnCoins() {
		return new ReturnCoins_1();
	}
	
	public DisposeDrink getDisposeDrink() {
		return new DisposeDrink_1();
	}
	
	public DisposeAdditive getDisposeAdditive() {
		return new DisposeAdditive_1();
	}
	
}
