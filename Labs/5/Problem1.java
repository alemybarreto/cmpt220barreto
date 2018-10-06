package lab5;

import java.util.Scanner;

public class Problem1 {
	
		public static int temp=0;
		    public static void main(String[] args){
		
		        int[] maxNum = new int[10];
		     Scanner input = new Scanner(System.in);
		
		       for(int i=0;i<maxNum.length;i++){
		
		       System.out.println("Please Enter The "+(i+1)+" Number: ");
		
		       maxNum[i]=input.nextInt();
		
		       if(maxNum[i]>temp)
	
		       {
	
		           temp=maxNum[i];

		       }
		
		       }
		
		       System.out.println("The maximum number is: " + temp);
		
		    }
		
		}
