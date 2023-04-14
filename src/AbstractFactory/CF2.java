package AbstractFactory;

import DataStore.*;

public class CF2 extends AF{
	public DataStore getDataStore() {
		return new DS_2();
	}
}
