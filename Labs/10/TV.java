package lab10;

public class TV extends Appliance {
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getNumberOfChannels() {
		return NumberOfChannels;
	}
	
	public void setNumberOfChannels(double numberOfChannels) {
		this.NumberOfChannels = numberOfChannels;
	}
	
	double height;
	double width;
	double NumberOfChannels;
	
	public TV(double voltage, String color, String madeIn, double price, double height, double width, double numberOfChannels) {
		super(voltage, color, madeIn, price);
		this.height = height;
		this.width = width;
		this.NumberOfChannels = numberOfChannels;
	}
	
	public TV(double voltage, String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	
	public static void main(String[] args) {

}

}