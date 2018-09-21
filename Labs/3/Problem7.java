package lab3;

public class Problem7 {

	public static void main(String[] args) {
		int count = 1;
		double number = 0;
		while (count <= 50) {
			double pentagonalNumber = (3*(number*number)-number)/2;
			number++;
			if (count % 10 == 0) {
				System.out.println(pentagonalNumber + " ");
			}
			else {
				System.out.println(pentagonalNumber + " ");
			}
			count++;
		}
	}

}
	
		


