package lab4;

import java.util.Scanner;

public class Problem4 {
	public static void countOccurances(String s) {
		int count[] = new int[256];
		int length = s.length();
		for (int i = 0; i < length; i++)
			count[s.charAt(i)]++;
		
		char ch[] = new char[s.length()];
		for (int i = 0; i < length; i++) {
			ch[i] = s.charAt(i);
			int find = 0;
			for (int j = 0; j <=i; j++) {
				if (s.charAt(i) == ch[j])
					find++;
			}
			if (find == 1)
				System.out.println("Number of Occurence of " + s.charAt(i) + " is:" + count[s.charAt(i)]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or phrase: ");
		String s = input.nextLine();
		s = s.replace(" ",  "").replace("!",  "").replace("@",  "").replace("#",  "").replace("$",  "")
				.replace("%",  "").replace("^",  "").replace("&",  "").replace("*",  "")
				.replace("(",  "").replace(")", "").replace("_", "").replace("-", "")
				.replace("+",  "").replace("=",  "").replace("~",  "").replace("`",  "")
				.replace("{",  "").replace("}",  "").replace("[",  "").replace("]",  "")
				.replace("|",  "").replace(":",  "").replace(";", "").replace("<",  "")
				.replace(">",  "").replace("?",  "").replace("/", "").replace(".", "");
		countOccurances(s);
		
	}
}
		
	



