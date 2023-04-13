package AbstractFactory;

import DataStore.*;

public class CF2 {
	public DataStore getDataStore() {
		return new DS_2();
	}
}
