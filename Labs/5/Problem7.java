package lab5;

import java.util.*;
import java.lang.*;

public class Problem7 {
	
	private static final int N = 3;
	   
    public static Boolean isUpperTriangularMatrix(int mat[][]) 
    { 
        for (int i = 1; i < N ; i++) 
            for (int j = 0; j < i; j++) 
                if (mat[i][j] != 0) 
                    return false; 
        return true; 
    }  
      
    public static void main(String argc[]){ 
        int[][] mat= { { 2, 1, 4 }, 
                       { 0, 3, -1 }, 
                       { 0, 0, -2 } }; 
                      
        if (isUpperTriangularMatrix(mat)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}

