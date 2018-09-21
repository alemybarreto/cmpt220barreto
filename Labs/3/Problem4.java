package lab3;

public class Problem4 {

	public static void main(String[] args) {
		int n = 1;
		int m = 1;
		while (n < 1500) {
			boolean prime = true;
			for (int i = 2; i < m; i++)
				if (m % i == 0) {
					prime = false;
					break;
				}
			if (prime) {
				n++;
				System.out.println(" " + m);
				if (n % 10 == 0)
					System.out.println();
			}
			m++;
		}
	}
	
}
