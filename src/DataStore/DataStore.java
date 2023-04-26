package DataStore;

// Data store
public abstract class DataStore {

	public abstract float getTemp_p();
	public abstract void setTemp_p(float p);
	
	public abstract float getTemp_v1();
	public abstract void setTemp_v(float v);
	
	public abstract float getPrice();
	public abstract void setPrice(float p);
	
	public abstract float getCF1();
	public abstract void setCF(float c);
	
	public abstract int getTemp_v2();
	public abstract void setTemp_v(int v);

	public abstract int getCF2();
	public abstract void setCF(int c);
}
