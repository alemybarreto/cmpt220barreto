package lab11;
import java.util.Scanner;

public class Problem18_17 {
	
	private static int i;


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a list of characters in one line: ");
		String str = input.nextLine();
		System.out.println("Enter a character: ");
		char ch = input.next().charAt(0);

        char[] chars = str.replaceAll(" ", "").toCharArray();
        System.out.println("The occurrences of '" + ch + "' in \"" + str + "\" = " + count(chars, ch));
    }
	
	
		private static int count(char[] chars, char ch) {
			return count(chars, ch, chars.length - 1);
		}
	
		private static int count(char[] chars, char ch, int high) {
			int count = (chars[high] == ch) ? 1 : 0;
			
			if (high == 0) 
				return count;
	
			else
				return count + count(chars, ch, high - 1); 
		}
	}