package lab2;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first character: ");
		String string1 = input.next();
		char char1 = string1.charAt(0);
		int int1 = (int) char1;
		System.out.println("Enter second character: ");
		String string2 = input.next();
		char char2 = string2.charAt(0);
		int int2 = (int) char2;
		int result = int1 + int2;
		System.out.println("Result is: " + result);

		}

	}
