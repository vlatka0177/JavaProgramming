package day45.shapeTask;

import day45.shapeTask.Shape;

public class Square extends Shape {

    private double side;

    // Call the constructor from the parent class
    public Square(double side) { // remove String name
        super("Square"); // change name to "Square"
        setSide(side); // change to setter
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0) {
            throw new RuntimeException("Invalid Side: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side; // change 0 to side * side
    }

    @Override
    public double perimeter() {
        return side * 4; // change 0 to side * 4
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                "side=" + side +
                '}';
    }
}
