package project1;

import java.util.Scanner;

public class Project2 {
	
	    public static void main(String[] args) {
	    	Scanner input = new Scanner(System.in);
	    	int height = input.nextInt();
	    	int width = input.nextInt();
	    	int n = input.nextInt();
	    	int[] x = new int[n];
	    	
	    	for (int i = 0; i < n; i++) {
	    		x[i] = input.nextInt();
	    	}
	    	
	    	int width2 = width;
	    		for (int i = 0; i < x.length; i++) {
	    			width2 -= x[i];
	    			
	    			if(width2 == 0) {
	    				width2 = width;
	    				height--;
	    				if(height == 0);
	    					System.out.println("YES");
	    					return;
	    			}
	    			
	    		}
	    		 int i = 0;
				if(width2 < 0) {
	    			System.out.println("NO");
	    			return;
	    		}
	    		else if (i == x.length - 1) {
	    			System.out.println("NO");
	    			return;
	    		}
	    }
	    
}
	    
	    	