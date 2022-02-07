package day45;

public class Circle extends Shape {

    private double radius; // instance because each circle has a different radius
    public final static double pi =3.14; // pi value is unchangeable, and the same for all circles

    // Generate a constructor
    public Circle(String name, double radius) {
        super("Circle"); // change name to "Circle"
        this.radius = radius;
    }

    // Generate getter
    public double getRadius() {
        return radius;
    }

    // Generate setter
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid Radius: " + radius);
        }
            this.radius = radius;
        }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +     // name, area, and perimeter are called in the child class with super keyword
                ", radius=" + radius +
                '}';
    }
}
