package AbstractFactory;

import DataStore.*;

public class CF1 {

	public DataStore getDataStore() {
		return new DS_1();
	}
}
