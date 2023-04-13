package DataStore;

public class DS_2 extends DataStore {
	private float temp_p;
	private int temp_v;
	private float price;
	private int cf;

	public DS_2() {
		this.temp_p = 0f;
		this.temp_v = 0;
		this.price = 0;
		this.cf = 0;
	}
	
	public float getTemp_p() {
		return this.temp_p;
	}
	
	public void setTemp_p(float p) {
		this.temp_p = p;
	}
	
	public float getTemp_v1() {
		return 0;
	}
	
	public int getTemp_v2() {
		return this.temp_v;
	}
	
	public void setTemp_v(int v) {
		this.temp_v = v;
	}
	
	public void setTemp_v(float v) {
		
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPrice(float p) {
		this.price = p;
	}
	
	public int getCF2() {
		return this.cf;
	}
	
	public float getCF1() {
		return 0;
	}
	
	public void setCF(int c) {
		this.cf = c;
	}

	public void setCF(float c) {
	}
	
	
}
