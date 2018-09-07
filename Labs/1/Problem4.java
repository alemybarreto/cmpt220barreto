package lab1;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for mass in kilograms: ");
		double mass = input.nextDouble();
		double speed = mass * 299972458 * 299972458;
		System.out.println(mass + " kilograms translates to " + speed + " E ");
	
	}

}
