package lab3;

public class Problem2 {

	public static void main(String[] args) {
		final int Numbers_Per_Line = 10;
		int count = 0;
		
		for (int i = 100; i <= 500; i++) {
			if (i % 5 == 0 & i % 7 == 0) {
				count++;
				
				if (count % Numbers_Per_Line == 0);
					System.out.println(i);
			}else {
					System.out.println(i + " ");	
				
			}
		}
		System.out.println();

	}

}
