package Lab6;

import java.text.DecimalFormat;

public class Bond {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	static double c;
	static double n;
	static double i;
	static double m;

	public static void main(String[] args) {
//		Bond mybond = new Bond(100, 6, .04, 110); 
//		double price = mybond.getPrice();
//		System.out.println("price is " + price);
	}
	
	public Bond(double coupon, int payments, double interest, double valuematurity){
		c = coupon;
		n = payments;
		i =  interest;
		m = valuematurity;
	}
		
	public String getPrice() {
		double price = c * (1 - (1/Math.pow(1 + i,  n))) + m * 1/Math.pow(1 + i,  c);
		String p = df2.format(price);
		return p;
	}

}
