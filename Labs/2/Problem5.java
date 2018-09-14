package lab2;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter 1st string: ");
		s1 = kb.next();
		System.out.println("Enter 2nd string: ");
		s2 = kb.next();
		
		if (s1.compareTo(s2) < 0) {
			System.out.println(s1 + " precedes " + s2 + " in lexicographic ordering");
		}
		
		else if (s1.compareTo(s2) > 0)
			System.out.println(s1 + " precedes " + s2 + " in lexicographic ordering");
	}

}
	
