package lab4;

public class Problem8 {

	public static void main(String[] args) {
			  
		      double[] numbers; 
		      int numCt;         
		      double num = 0;        
		    
		      numbers = new double[100];   
		      numCt = 0;                   
		    
		      System.out.println("Enter up to 100 positive numbers; Enter 0 to end: ");
		    
		      while (true) {   
		         if (num <= 0)
		            break;
		         insert(numbers, numCt, num);
		         numCt++;
		      }
		      
		      System.out.println("Your numbers in sorted order are: ");
		    
		      for (int i = 0; i < numCt; i++) {
		    	  System.out.println( numbers[i] );
		      }
		    
		   } 

static void insert(double[] A, int itemsInArray, double newItem) {
    int loc = itemsInArray - 1;
    while (loc >= 0 && A[loc] > newItem) {
           
       A[loc + 1] = A[loc];
       loc = loc - 1;
    }
    A[loc + 1] = newItem;  
 } 

}  
