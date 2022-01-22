package day41_Exceptions;

import day36_Inheritance.encapsulation.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        // UNCHECKED EXCEPTION

        int a = 10;
        int b = 0;

        System.out.println(a / b);
        // The result of A division of any non-zero number by zero is undefined.

        System.out.println("Wooden Spoon");
        /* ArithmeticException
           Exit code 1 -> something went wrong
        */

        char[] characters = {'A', 'B', 'C'};
                    //  Index 0    1    2
        System.out.println(characters[99]);
        /* ArrayIndexOutOfBoundsException
           Exit code 1
        */

        Student student = null;
        // Object is null. Does not exist.
        System.out.println(student.getName());
        /* NullPointerException
           Exit code 1
        */

        final String str = "Wooden Spoon"; /* Final keyword makes the object ineligible for Garbage Collection
        str = null;
        System.out.println(str.toUpperCase()); */

        String str2 = ""; /* "" indicates that it is A string object, an empty string.
                             object != null                                        */


        // CHECKED EXCEPTION

        System.out.println("Hello");
        // Thread.sleep(3000);
        System.out.println("Cydeo");

        // Not able to run the code. Requires immediate attention.

        // FileInputStream file = new FileInputStrem(name: "path of the file");

    }
}
