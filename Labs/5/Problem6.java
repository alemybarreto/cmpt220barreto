package lab5;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the numbers in  the array: ");

        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<columns ; j++)
            {
                array[i][j] = input.nextInt();
            }
        }
        int rowSum = 0;
        int colSumArr[] = new int[columns];
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0  ; j<columns ; j++)
            {
                rowSum = rowSum + array[i][j];
                colSumArr[j] = colSumArr[j] + array[i][j];
                System.out.print(array[i][j] + " , ");
            }
            System.out.println( " The average is= " + (double)rowSum/columns);
            rowSum = 0;
        }
        System.out.printf("The average is= ");
        for(int i=0;i<columns;i++){
            if(i!=columns -1)
                System.out.print((double)colSumArr[i]/rows + " and ");
            else
                System.out.print((double)colSumArr[i]/rows + " for the columns");
        }
    }

}
        