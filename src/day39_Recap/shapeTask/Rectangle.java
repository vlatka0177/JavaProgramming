package day39_Recap.shapeTask;

    /*
    Rectangle extends Shape:
	variables: length, width
	Encapsulate the fields
	Add A constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
    */

public class Rectangle extends Shape {

    // Variables
    private double length, width;

    // Encapsulating the fields
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Invalid Length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            System.err.println("Invalid Width: "+width);
            System.exit(1);
        }
        this.width = width;
    }

    // Constructor to set the fields
    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {  // double for the number, String for the text
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * ( length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}


