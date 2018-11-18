package lab10;

public class Toaster extends Appliance{
	
	public double getMaxTemp() {
		return maxTemp;
	}
	
	public double getMaterial() {
		return material;
	}
	
	public void setMaterial(double material) {
		this.material = material;
	}
	double slots;
	double maxTemp;
	double material;
	
	public Toaster(double voltage, String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.voltage = voltage;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
		
	}

		
		public Toaster(double voltage, String color, String madeIn, double price, double slots, double maxTemp, double material) {
			super(voltage, color, madeIn, price);
			this.slots = slots;
			this.maxTemp = maxTemp;
			this.material = material;
		}
		
		public static void main(String[] args) {
			
		}
	}


