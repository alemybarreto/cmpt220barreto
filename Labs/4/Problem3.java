package lab4;

import java.util.Scanner;

interface Test   {                 
String getInput();
boolean IsPalindrome(String s);
void displayInput();
        }

 abstract class Sub_Test  implements Test
      {
  public String getInput()
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a String: ");
      String str = scan.nextLine();
      return str;
  }
  public boolean IsPalindrome(String s) { 
      int limit = s.length() - 1;
      char st1 [] = s.toCharArray();
  Inner:for( int i = 0,j = limit; i < j ; i++,j--){
	  
          if(st1[i] == st1[j])
              return true;
          else 
              break Inner;
      }
             return false;
  }
  
         public void displayInput() {
     String input = getInput();
     boolean word = IsPalindrome(input);
     if(word)
       System.out.println("Given String "+input+" is palindrome ");
     else
       System.out.println("Given String "+input+" is NOT palindrome ");
               }  

            }  

   public class Problem3 extends Sub_Test {

public static void main(String[] args) {
   
   Problem3 object = new Problem3();
   object.displayInput();
}
         } 

