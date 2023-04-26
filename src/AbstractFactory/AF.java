package AbstractFactory;
import DataStore.*;
import OP.Strategy.*;

// Abstract Factory pattern

public abstract class AF {

	public abstract DataStore getDataStore();
	
	public abstract StorePrice getStorePrice();
	
	public abstract ZeroCF getZeroCF();
	
	public abstract IncreaseCF getIncreaseCF();
	
	public abstract ReturnCoins getReturnCoins();
	
	public abstract DisposeDrink getDisposeDrink();
	
	public abstract DisposeAdditive getDisposeAdditive();
	
	
}
