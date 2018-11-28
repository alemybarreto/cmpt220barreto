package lab11;
import java.util.Scanner;

public class Problem18_11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long n = input.nextLong();

		System.out.println("The sum of " + n + " = " + sumDigits(n));
		}

	public static int sumDigits(long n) {
		int temp = (int)Math.abs(n);
		int sum = 0;
		
		while(temp != 0) {
			sum += (temp % 10);
			temp = temp / 10;
		}
		return sum;

		}
	}
