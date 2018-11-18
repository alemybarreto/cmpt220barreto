package lab10;

public class Appliance {
	public double voltage;
	public String color;
	public String madeIn;
	public double price;
	
	public Appliance(double  voltage, String color, String madeIn, double price) {
		super();
			this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	
	public double getVoltage() {
		return voltage;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMadeIn() {
		return madeIn;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

}
