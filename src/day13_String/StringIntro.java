package day13_String;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        /*
        String Class is presented in Lang package that is in Java package. (java.lang)
        (Scanner is presented in Util package that is in Java package.)
        Any class outside the package has to be imported with import statement to be used.
        (Scanner scan; gives compile error unless Scanner Class is imported from Util package.)
        Any class in java.lang package can be imported implicitly (automatically).

        String Class is representing char sequences.
        An object represents sequences of characters.
        Each character in the string object has an index number.
        Index numbers in Java start from zero.
        Last index: length() -1

        String str = "Cydeo"   (5 characters)
        Index =       01234    (5 index numbers with the last one being 4)

        String is immutable. Once the object is created it cannot be modified.

        String str = "cydeo";
        str = str.toUpperCase();
        Has to be reassigned to the variable str to create the new object, upper case "CYDEO"
        because once created, "cydeo" cannot be modified.

        Two ways of creating String object:
        1. by String Literal
            Created by using double quotes. */

        String str5 = "Java";
        String str6 = "Java";

         /* Two string literal objects with the same sequence of characters in the same order.
            Stored in String Pool, which does not accept duplicates.
            Only one object of "Java" is stored in String Pool within Java Heap. */

        String name = "Wooden Spoon"; // Stored in String Pool within Java Heap.
        String name2 = "Wooden Spoon"; // One object created in String Pool "Wooden Spoon"
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name == name2); // true
        System.out.println(name2 == name3); // true
        System.out.println(name3 == name4); // true

        System.out.println("---------------------------------------------------");

        /*
        2. by new keyword
            Creates new different object in Java Heap, but NOT in String Pool. */

        String str1 = new String( "Wooden Spoon");
        String str2 = new String( "Wooden Spoon"); // new keyword creates different object
        String str3 = new String( "Wooden Spoon");
        String str4 = new String( "Wooden Spoon");

        System.out.println(str1 == str2); // false
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false

        // No need to type original: Set up string with bracket, and it is automatically inserted.

       /* Stack stores local variables.
        Heap is A memory location in Java for all objects. Objects consume memory.
        Within Heap there is String Pool, which is reserved for string literals only.

        Scanner scan = new Scanner(System.in);
        Scanner scan variable is stored in Stack.
        new Scanner(System.in) is stored in Heap. */

        System.out.println("---------------------------------------------------");

        String s1 = "Java";
        String s2 =new String("Java");

        System.out.println( s1.equals(s2) ); // true


        String s3 = "Java";
        String s4 =new String("java");

        System.out.println( s3.equals(s4) ); // false


    }
}
