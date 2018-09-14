package lab2;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting range: ");
		int number = input.nextInt();
		
		System.out.println("Enter final range: ");
		int renum = input.nextInt();
		
		int random_num = number + (int)(Math.random() * (renum - number) +1);
		System.out.println("Random number between given range: " + random_num);
		int random_num2 = number + (int)(Math.random() * (renum - number) +1);
		System.out.println("Random number between given range: " + random_num2);
		int random_num3 = number + (int)(Math.random() * (renum - number) +1);
		System.out.println("Random number between given range: " + random_num3);
		}


	}
