package day39_Recap.shapeTask;

public class Square extends Shape {

    /*
    Square extends Shape:
	Variables: side
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */

    private double side;
    /* The only way to read and write this data is through getter and setter because the data is private
       If public, there would be no control over data.
    */

    //Encapsulating the field
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }

        this.side = side;
    }

    // Constructor to set the field         -100
    public Square(double side) {
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

