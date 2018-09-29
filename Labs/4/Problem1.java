package lab4;

public class Problem1 {

	public static void main(String[] args) {
		System.out.printf("%-15s%-15s%5s%-15s%-15s\n", "Inches", "Centimeter", "|    ", "Centimeter", "Inches");
	    System.out.println("----------------------------------------------------------");

	    double inches = 1; double centimeter = 1;
	    for (int i = 1; i <= 50; inches += 1, centimeter += 5, i++) {
	      System.out.printf("%-15.1f%-15.1f%5s%-15.1f%-15.2f\n", inches, inchesToCentimeter(centimeter), "|    ", centimeter,
	          centimeterToInches(centimeter));
	    }
	  }

	  public static double inchesToCentimeter(double inches) {
	    return inches / 0.39370 ;
	  }

	  public static double centimeterToInches(double centimeter) {
	    return centimeter * 0.39370;
	  }
		

	}
