package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    /* ENCAPSULATION
       - data hiding
       - gives private access modifier to fields
    */

    private Circle circle;

    private Square square;

    // Generating Getter - for reading the data
    public Circle getCircle() {  // public access modifier = always visible

        return circle;
    }

    // Generating Setter - for writing the data
    public void setCircle(Circle circle) { // Parameter has to match the data type of the private variable

        if (circle.getRadius() < 5) {
            return;
        }
        this.circle = circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}

    /* INHERITANCE
       - IS A relation between the classes
       - parent (super) and child (sub) classes

         class A extends class B

       - child class (sub) inherits the variables and methods from a parent class (super)
         that are visible to the child class
       - parent class (super) cannot inherit anything from a child (sub) class
       - at least one constructor from the parent class has to be called in the child class
       - with the default constructor, the constructor in the child class is called implicitly
       - super keyword
       */



