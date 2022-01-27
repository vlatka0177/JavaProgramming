package day39_Recap.shapeTask;

public class Circle extends Shape {

    /*
    Circle extends Shape
    Variables:
			radius
			pi (static)
	Encapsulate the field
	Add A constructor to set the filed
	area(): radius * radius * pi
	perimeter(): 2 * radius * pi
	toString(): r, pi, area, perimeter
    */

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    // Encapsulating the fields
    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }
    // Constructor to set the fields
    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double area() {


        return radius * radius * pi;
    }

    public double perimeter() {

        return 2 * radius * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}


