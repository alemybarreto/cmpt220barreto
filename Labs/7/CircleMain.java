package lab7;

public class CircleMain {

	public static void main(String[] args) {


    Circle c1 = new Circle(2, 2, 5.5);

    System.out.println("C1 area = " + c1.getArea() + " perimeter = " + c1.getPerimeter());
    System.out.println("Does c1 contain coordinate (3,3)? " + c1.contains(3, 3));
    System.out.println("Does c1 contain circle 2? " + c1.contains(new Circle(4, 5, 10.5)));
    System.out.println("Does c1 overlap circle 3? " + c1.overlaps(new Circle(3, 5, 2.3)));
    
	}
	}



