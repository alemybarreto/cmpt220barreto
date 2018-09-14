package lab2;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		System.out.println("Enter a second integer: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if (number1 < number2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		if (number1 <= number2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		if (number1 == number2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		if (number1 != number2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		if (number1 > number2)
			System.out.println("True");
		else {
			System.out.println("False");
		}
		if (number1 >= number2)
			System.out.println("True");
		else {
			System.out.println("False");
		}

	}

}
