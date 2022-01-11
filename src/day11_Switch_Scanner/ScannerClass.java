package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // in = input (getting), out = output (displaying)

        System.out.println("Enter an integer: "); // displayed before the user enters the number

        int num1 = input.nextInt();

        System.out.println("Enter a decimal: ");

        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1*num2));

        input.close();  /* Closes the scanner.
                           Any attempt to use the scanner after it is closed compiles an error.*/

       /*
        Presented in java.util package

        import java.util.Scanner;
           |        |       |
        keyword  package  class

        Needs to be imported in our program.

        Scanner input = new Scanner(System.in);
        Connects to the keyboard.

        Scanner Methods decide what input the user has to provide.

        nextByte()          Returns input as a byte
        nextShort()         Returns input as a short
        nextInt()           Returns input as an integer
        nextLong()          Returns input as a long
        nextFloat()         Returns input as a float
        nextDouble()        Returns input as a double
        next Boolean()      Returns input as a Boolean
        next()              Returns input as a String.
                            Reads the input only until a space.
        nextLine()          Returns input as a String.
                            Reads the entire input until the new line (press enter).

         */



    }
}
