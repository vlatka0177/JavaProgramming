package day34_GarbageCollection_AccessModifiers;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Circle {

    public double radius; // instance variable
    public static double pi = 3.24; // static variable, here directly assigned
    public static String name = "Circle"; // static variable, here directly assigned

    public static ArrayList<Integer> numbers; // Creating an array list object


    public Circle(double radius) { /* Constructor runs multiple times when multiple objects are created.
                                      Never used for static variables because that would be inefficient.
                                      Used only for instances.                                        */
        this.radius = radius; // use this keyword to call instance
    }

    /* Static block is used for static variables instead of constructor.
    Static block gets executed automatically once as soon as the class is loaded. */

    static {
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>(); // Static block is used when multiple steps are required to set a static variable
        numbers.add(10);
        numbers.add(20);
    }
    /*

    public static void main(String[] args) {

        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi); // pi = 3.14
        System.out.println("name = " + name); // name = Circle
        System.out.println("numbers" + numbers); // numbers[10, 20]

        Main method runs within the class, and not outside.  */

}
