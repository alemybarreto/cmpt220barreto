package lab4;

	public class Problem5{
		public static void main(String[] args) {
			
			int[] numbers = new int[1000];
			for (int i = 0; i < 1000; i++) {
				numbers[i] = (int)(Math.random()*1000);
		}
		int sum = 0; 
		for (int j = 0; j < 1000; j++) {
			sum += numbers[j];
		}
		int average = sum/1000;
		System.out.println("The average of 1000 random integers equals: " + average);
		
		int belowAverageCount = 0;
		int aboveAverageCount = 0;
		int equalAverageCount = 0;
		for (int k = 0; k < 1000; k++) {
			if (numbers[k] < average) {
				belowAverageCount++;
			}
			if (numbers[k] > average) {
				aboveAverageCount++;
			}
			else {
				equalAverageCount++;
			}
			
		}
			
		System.out.println("There are " + belowAverageCount + "numbers below the average.");
		System.out.println("There are " + aboveAverageCount + "numbers above the average.");
		}
	}
	
	
	
	

	   
