package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the values for the first array followed by the values: ");
        int n = scan.nextInt();
        int[] values1 = new int[n];
        for (int i = 0; i < n; i++) {
            values1[i] = scan.nextInt();
        }
        System.out.print("Enter the values for the secong array followed by the values: ");
        int j = scan.nextInt();
        int[] values2 = new int[j];
        for (int i = 0; i < j; i++) {
            values2[i] = scan.nextInt();
        }
        
        equal(values1, values2);
        
    }
    
    public static boolean equal(int[] x, int[] y) {
        Arrays.sort(x, 1, x.length);
        Arrays.sort(y, 1, y.length);
        boolean identical = false;
        if (x == y) {
            identical = true;
            System.out.println("The two arrays are identical.");
        }
        else {
            identical = false;
            System.out.println("The two arrays are not identical.");
        }
        return identical;
    }

}
	
