package lab5;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);


	        System.out.println("Please enter the number of integers:"); 
	        double size = scan.nextDouble();

	        double meanSum = 0;
	        double deviationSum = 0;
	        double array[] = new double [(int) size];


	        System.out.println("Please enter the numbers");
	        for (int i = 0; i < size; i++)
	            {
	                 array[i]= scan.nextDouble();
	            }


	        for (int i = 0; i < size; i++)
	            {
	                meanSum += array[i];
	            }

	        double mean = ((meanSum / size));
	        System.out.println("The mean is: " + mean);




	       
	        for (int i = 0; i < size; i++)
	            {
	                array[i] = (Math.pow((array[i] - mean), 2));
	            }
	        for (int i = 0; i < size; i++)
	        {
	            deviationSum += array[i];
	        }

	        double variance = ((deviationSum / size));

	        double standardDeviation = Math.sqrt(variance);
	        System.out.println("The standard deviation is: " + standardDeviation);

	    }


	}

