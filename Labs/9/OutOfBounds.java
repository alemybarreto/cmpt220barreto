package lab9;

import java.util.Scanner;

public class OutOfBounds {
	 public static void main(String[] args) {

	        int[] array = new int[100];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = (int) (Math.random() * 100);
	        }
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        System.out.print("Enter an index: ");
	        try {
	            int index = input.nextInt();
	            System.out.println("array[" + index + "] = " + array[index]);
	        } catch (IndexOutOfBoundsException ex) {
	            System.out.println("Index " + ex.getLocalizedMessage() + " is out of bounds");
	        } catch (Exception ex) {
	            System.out.println("Invalid Input");
	        }
	    }
	}
