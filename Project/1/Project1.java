

import java.util.Scanner;

	public class Project1 {

	    public static void main(String[] args){
	    	Scanner input = new Scanner(System.in);
	    	int height = input.nextInt();
	    	int width = input.nextInt();
	    	int numberOfBricks = input.nextInt();
	    	int width2 = 0;
	    	int height2 = 0;
	    	
	    	int[] length = new int[numberOfBricks];
	    	
	    	for (int i = 0; i < numberOfBricks; i++) {
	    		length[i] = input.nextInt();
	    	}
	    	System.out.println("hello");
	    	for(int i = 0; i < numberOfBricks; i++) {
	    		width2 += length[i];
	    		System.out.println("length" + length[i]);
	    		System.out.println("width2 " + width2);
	    		if (width2 == width) {
	    			width2 = 0;
	    			height2 += 1;
	    			if (height2 == height) {
	    				System.out.println("Got to proper height");
	    				i = numberOfBricks;
	    				width2 = width;
	    				//return;
	    			}
	    		} 
	    	}
	    	System.out.println("width " + width);
	    	System.out.println("width2 " + width2);
	    	System.out.println("height " + height);
	    	System.out.println("height2 " + height2);
	    	if(width2 == width && height2 == height) {
	    		System.out.println("YES");
	    		
	    	}else {
	    		System.out.println("NO");
	    		
	    	}
	    
	    	System.out.println("hello");

	}
}