package lab3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer, the input ends when 0 is entered: ");
		int number = input.nextInt();
		int counter = 0;
		int sum = 0;
		int evenCounter = 0;
		double CountIncrement = 0;
		while (number !=0) {
			if(number % 2 == 0) {
				evenCounter ++;
			
			}
			CountIncrement ++;
			sum += number;
			number = input.nextInt();
			
		}
			
		System.out.println("The number of even numbers: " + evenCounter);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + sum/CountIncrement);
}

}