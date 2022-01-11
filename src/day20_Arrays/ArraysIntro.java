package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        /*
        ARRAY:
        1. Single Dimensional
        2. Arrays Utility
        3. For Each Loop
        4. Multidimensional Array

        Data structures:
        - use data efficiently
        - store data in an organized manner

        Types of data structures:
        1. Array
           - Special variable that holds multiple values of the same data type (elements)
           - Fixed size
           - Supports both primitives and non-primitives
           - Every Element has index numbers
        2. Collection
           - Size is not fixed
           - Only supports non-primitives
        3. Map
           - Size is not fixed
           - Only supports non-primitives

        Declaring arrays

        DataType[] variable name;

        There are two ways to declare one-dimensional array variables.

        1. Declare and instantiate in separate statements
           If we know the exact data:

           Datatype[] variable name;
           variable name = new Datatype[length]

           int[] scores;
           scores = new int[4];

        2. Declare and instantiate in single statements.
           If we do not know the exact data:

           DataType[] variable name = new DataType[length]
           int[] scores = new int[4];
           String[] names = new String[5];

           If we know the exact data:
           DataType[] variable name = {data1, data2, data3}

        Task:
        Create a variable that is capable of containing 5 names.         */

        String[] myGroup = new String[5];
        // Initialize the size of the array: 5 variables. Index 0~4.

        myGroup[0] = "Goran";
        myGroup[1] = "Nives";
        myGroup[2] = "Suzana";
        myGroup[3] = "Helena";
        myGroup[4] = "Miroslav";

        // myGroup[5] = "Mislav"; Index 0 ~4. 5 variables.
        // myGroup[-1] = "Adam"; The lowest index number is 0.

        // System.out.println(myGroup); // Hashcode. Cannot directly pass the name of the variable to print.

        System.out.println(Arrays.toString(myGroup)); // [Goran, Nives, Suzana, Helena, Miroslav]
        /* Arrays + enter, creates import java.util.Arrays

           Default values:
           non primitives: null
           primitives: byte, short, int, long ==> 0
           float, double ==> 0.0
           boolean ==> false

           Accessing Array Elements
           - Elements of an array can be accessed by using the square brackets[].
           - Index number needs to be provided

                 index
                   |
           numbers[0] = 20;
               |         |
           arrayRefVar  value

           numbers[3] = 30;
         */

        System.out.println("----------------------------------------------------------------");

         /*
           Array Initialization
           - initializes array's elements when creating an array.

           int[] myList = {1, 2, 3, 4, 5};


        If the number of elements and what those elements are is known:   */

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        /* index:           0          1            3          4           5         6           7
           days[7] = "JavaDay"; Creates error because the size is fixed  */

        System.out.println( Arrays.toString(days)); // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        int number = 5;

        if(number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println( days[number-1] ); // Friday

        }

    }

