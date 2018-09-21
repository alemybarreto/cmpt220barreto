package lab3;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a = in.nextDouble();
		System.out.println("Enter the second number: ");
		double b = in.nextDouble();
		System.out.println("Enter the third number: ");
		double c = in.nextDouble();
		System.out.println("The average value is " + average(a, b, c));
	}
	
	public static double average(double a, double b, double c) 
	{
		return (a + b + c) / 3;
		
	}
	
	


}
