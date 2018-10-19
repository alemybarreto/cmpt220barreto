package Lab6;

public class Problem1a {
	private class Rectangle {
		
			private double height;
			private double width;
		
			public Rectangle(double wid, double high){
			height = high;
			width = wid;
			} 
			public Rectangle(){
			height = 1;
			width = 1;

			} 
			public void setHeight(double high){
			height = high;
			}
			public void setWidth(double wid){
			width = wid;
			} 
			public double getArea(){
			return height*width;
			}
			public double getPerimeter(){
			return 2*(height + width);
			

			}
		}
		
			public class RectangleDemo {
			public void main(String[] args){
			Rectangle box1 = new Rectangle();
			Rectangle box2 = new Rectangle(40, 40);
			Rectangle box3 = new Rectangle(35.9, 35.9);
			System.out.println("The perimeter of the first box is: " + box1.getPerimeter() + "\n");
			System.out.println("The perimeter of the second box is: " + box2.getPerimeter() + "\n");
			System.out.println("The perimeter of the third box is: " + box3.getPerimeter() + "\n");
			System.out.println("The area of the first box is: " + box1.getArea() + "\n");
			System.out.println("The area of the second box is: " + box2.getArea() + "\n");
			System.out.println("The area of the third box is: " + box3.getArea() + "\n");
			}
		
	}

}
