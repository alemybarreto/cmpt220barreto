package lab8;

public class TestTriangle  {
	
	public static void main(String[] args) {
    	Triangle triangle = new Triangle(1, 1.5, 1);
    	triangle.setColor("yellow");
    	triangle.setFilled(true);
    	
    	System.out.println(triangle);
    	System.out.println("The area is " +triangle.getArea1());
    	System.out.println("The perimeter is "  + triangle.getPerimeter());
    	System.out.println("Color: " + triangle.getColor());
    	System.out.println("Is Filled? " + triangle.isFilled());
    	System.out.println(triangle);
    	
    }
}
    
