package Project3;
import java.util.Scanner;
import java.util.Date;

public class Reservation {
	
	
	
	    private static int[] seats = new int[10];
	 
	    public static void main(String args[]) {
	        System.out.println("Welcome to the Metro-North Railroad train reservation system!");
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        System.out.println("Train stops at Grand Central Station, enjoy the ride!");
	        System.out.println();

	        

	        for (int i = 0; i < 10; i++) {
	            seats[i] = 0;
	        }
	    	

	        Scanner s = new Scanner(System.in);
	        int choice = 1;

	        System.out.print("Please enter 1 for window, 2 for aisle, or 0 to exit: ");
	        choice = s.nextInt();
	        
	        while (choice != 0) {
	            int seatnumber = 0;

	            if (choice == 1) {
	                seatnumber = bookWindow();

	                if (seatnumber == -1) {
	                    seatnumber = bookAisle();
	                    if (seatnumber != -1) {
	                    	System.out.println("/t");
	                        System.out.println("Sorry, we were not able to book a window seat. But do have an aisle seat.");
	                        printBoardingPass(seatnumber);
	                    }
	                }
	                
	                else {
	                	
	                    System.out.println("You are in luck, we have a window seat available!");
	                    printBoardingPass(seatnumber);
	                }
	            }
	            else if (choice == 2) {

	                seatnumber = bookAisle();

	                if (seatnumber == -1) {
	                    seatnumber = bookWindow();

	                    if (seatnumber != -1) {
	                        System.out.println("Sorry, we were not able to book an aisle seat. But do have a window seat.");
	                        printBoardingPass(seatnumber);
	                    }
	                }
	                else {
	                    System.out.println("You are in luck, we have an aisle seat available!");
	                    printBoardingPass(seatnumber);
	                }
	            }
	            else {
	                System.out.println("Invalid choice made. Please try again!");
	                choice = 0;
	            }

	            if (seatnumber == -1) {
	                System.out.println("We are sorry, there are no window or aisle seats available.");
	                System.out.println();
	            }
	            
	            System.out.print("Please enter 1 for window, 2 for aisle, or 0 to exit: ");
	            choice = s.nextInt();

	        }

	    }

	    private static int bookWindow() {
	        for (int i = 0; i < 5; i++) {
	            if (seats[i] == 0) {
	                seats[i] = 1;
	                return i + 1;
	            }
	        }
	        return -1;
	    }

	    private static int bookAisle() {
	        for (int i = 5; i < 10; i++) {
	            if (seats[i] == 0) {
	                seats[i] = 1;
	                return i + 1;
	            }
	        }
	        return -1;
	    }
	
	    private static void printBoardingPass(int seatnumber) {
	
	        Date timenow = new Date();
	
	        System.out.println();
	        System.out.println("Date: " + timenow.toString());
	        System.out.println("Boarding pass for seat number: " + seatnumber);
	        System.out.println("This ticket is non-refundable and non-transferable.");
	        System.out.println("Please be curteous, do not smoke. Enjoy your trip.");
	        System.out.println();
	
	    }
	}


