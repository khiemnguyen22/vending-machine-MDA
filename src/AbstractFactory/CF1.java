package AbstractFactory;

import DataStore.*;

public class CF1 extends AF {

	public DataStore getDataStore() {
		return new DS_1();
	}
}
