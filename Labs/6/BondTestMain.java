package Lab6;

public class BondTestMain {

	public static void main(String[] args) {
		Bond bond1 = new Bond(100, 6, .04, 110);
		
		System.out.println("The price of bond 1 is: " + bond1.getPrice());
	}

}
