package Lab6;

class MySquare {
	double width = 1;
	
	public MySquare(double newWidth) {
		width = newWidth;
	}
	
	public static void main(String[] args) {
		MySquare Square = new MySquare(40);
		printArea(Square.width, Square.getArea());
		printPerimeter(Square.width, Square.getPerimeter());
		
		MySquare secondSquare = new MySquare(35.9);
		printArea(secondSquare.width, secondSquare.getArea());
		printPerimeter(secondSquare.width, secondSquare.getPerimeter());
		
	}
		public double getArea() {
			return width * width;
		}
		
		public static void printArea(double width, double area) {
			System.out.println("The area of a square with width " + width + " and height " + width + " is " + area);

		}
		
		public double getPerimeter() {
			return (4 * width);
		}
		
		public static void printPerimeter(double width, double perim) {
			System.out.println("The perimeter of a square is " + perim);
			
		}

		
}
