package lab8;

public class Triangle extends GeometricObject {
	private double side1, side2, side3;

    public Triangle() {
    	side1 = 1.0;
    	side2 = 1.0;
    	side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    public double getPerimeter1() {
    	return side1 + side2 + side3;
    }
    
    public String toString1() {
    	return "Triangle: side1 = " + side1 + " side 2 = " + side2 + " side3 = " + side3; 
    }



    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }

    public double getArea1() {
        return (side1 + side2 + side3) / 2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
               + " Side 3 = " + side3;
        }


	}
    


