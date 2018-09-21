package lab3;

public class Problem3 {

	public static void main(String[] args) {
		int twentyCount = 0;
		
		for( int i1 = 1; i1 <= 100; i1++) {
			twentyCount ++;
			if (twentyCount % 20 ==0) {
				System.out.println(" The ASCII value of " + (char)i1 + " = " + i1);
			}
			else {
				System.out.print((char)i1 + " ");
			}
			
				
		}
	}
	
	}

