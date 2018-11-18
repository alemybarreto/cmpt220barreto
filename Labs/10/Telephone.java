package lab10;

public class Telephone extends Appliance {
	
	public String getMaterial( ) {
		return material;
	}
	
	public String getCellBrand() {
		return cellBrand;
	}
	
	public boolean isSmart() {
		return isSmart;
	}
	
	String material;
	String cellBrand;
	boolean isSmart;
	
	public Telephone(double voltage, String color, String madeIn, double price, String material, String cellBrand, boolean isSmart) {
		super(voltage, color, madeIn, price);
		this.material = material;
		this.cellBrand = cellBrand;
		this.isSmart = isSmart;
	}
	
	public Telephone(double voltage, String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	
	public static void main(String[] args) {

}
}
