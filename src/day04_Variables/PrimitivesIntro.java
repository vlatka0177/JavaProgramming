package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        /*
        Declare variable:
        dataType variableName = data;

        Primitives:
        Always lower case
        int: for integers
        double: for decimals
        char: for single characters - always inverted single commas ' '
        booleans: true/false

        String: sequence of characters (string of text)
        Always inverted double commas " "
        Always capitalized because it is a class

        soutv + enter is a shortcut to print a variable

        Variable naming rules:
        1. Must be unique, meaningful, readable, understandable
        2. Starts with a lower case letter
        3. Camel Case
        4. It cannot start with digits
        5. No Java Reserved Words (can be included, but not stand on its own)
        6. No special characters other than _ and $

        How to replace variable names?
        Mac:
        1. Ctrl (Command) + R
        2. type old variable name
        3. type new variable name
        4. click Replace All
         */

        // age: 56 years old
        byte age = 56;

                //weight: 160 pounds
        //byte weight = 160; // 160 is out of byte' range
        //byte num = -129; // -129 is out of byte'range
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; //int is the preferred data type for integer numbers

        long assets = 9_999_999_999_999L;

        //tax:0.26
        float tax = 0.2613F;
        double PI = 0.26;

// '#' char variable
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35; // 35 represents # in ASCII Table
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 > 300; //expression evaluated as true or false

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "North Potomac";
        String state = "Maryland";
        String country = "USA";



    }
}
