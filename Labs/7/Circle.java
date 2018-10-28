package lab7;

public class Circle {
	private double x;
    private double y;
    private double radius;

    public Circle(Circle c) {
        this(c.getCenterX(), c.getCenterX(), c.getRadius());
    }
    private double getCenterX() {
		return 0;
	}
	public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(0, 0, 1);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {

        return 2 * radius * Math.PI;

    }
    private MyPoint getPoint() {
        return new MyPoint(this.x, this.y);
    }



    public boolean contains(Circle circle) {
        double distance = getPoint().distance(circle.x, circle.y);

        if (distance <= Math.abs(this.radius - circle.radius)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean c1ContainsC2(Circle c1, Circle c2) {
        Circle cir1 = new Circle(c1);
        Circle cir2 =new Circle(c2);

        return cir1.contains(cir2);
    }

    public static boolean c1OverlapsC2(Circle c1, Circle c2) {
        Circle cir1 = new Circle(c1);
        Circle cir2 =new Circle(c2);

        if (cir1.contains(cir2) || cir2.contains(cir1)) return false;

        return cir1.overlaps(cir2);
    }

    public boolean overlaps(Circle circle) {
        double distance = getPoint().distance(circle.x, circle.y);

        if (distance  <= this.radius + circle.radius)
            return true;
        else
            return false;

    }

    

    @Override
    public String toString() {
        return "Circle2D{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    public boolean contains(double x, double y) {

        double distance = getPoint().distance(x, y);

        if (distance <= radius) return true;
        else return false;
    }
}

	
	