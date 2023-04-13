package DataStore;

public class DS_1 extends DataStore{
	private float temp_p;
	private float temp_v;
	private float price;
	private float cf;
	
	public DS_1() {
		this.temp_p = 0f;
		this.temp_v = 0f;
		this.price = 0f;
		this.cf = 0f;
	}
	
	public float getTemp_p() {
		return this.temp_p;
	}
	
	public void setTemp_p(float p) {
		this.temp_p = p;
	}
	
	public float getTemp_v1() {
		return this.temp_v;
	}
	
	public int getTemp_v2() {
		return 0;
	}	
	
	public void setTemp_v(float v) {
		this.temp_v = v;
	}
	
	public void setTemp_v(int v) {

	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPrice(float p) {
		this.price = p;
	}
	
	public float getCF1() {
		return this.cf;
	}
	
	public int getCF2() {
		return 0;
	}
	
	public void setCF(float c) {
		this.cf = c;
	}
	
	public void setCF(int c) {
		
	}

}
