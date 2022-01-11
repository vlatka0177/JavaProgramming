package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(Circle.pi); // 3.14
        System.out.println(Circle.name); // Circle
        System.out.println(Circle.numbers); // [10, 20]

    /* Static block executes the static variables automatically.
       Main method does not run outside the class.
    */

        System.out.println("-----------------------------------------------");

        // Find the sum of 10, 20.
        int r1 = sum(10, 20);
        System.out.println(r1); // 30

        // Find the sum of 100, 200.
        int r2 = sum(100, 200);
        System.out.println(r2); // 300

        int r3 = subtract(100, 500);
        System.out.println(r3); // -400

        int r4 = max(1000, 2000);
        System.out.println(r4); // 2000

    }

}
