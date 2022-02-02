package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    /*
    THROW KEYWORD
    - Used to manually create a new exception to terminate the program
      when in a conditional statement, the condition is not made.

    throw ExceptionObject
    String browser = "Cydeo"; // invalid browser
    Throw an exception to terminate the program.
    */

    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if(age < 0) {
         /* System.err.println("Invalid age: " + age);
            System.exit(1);                         */
            throw new InputMismatchException("Age cannot be negative: " + age);
            /* throw keyword + new keyword to create an object from the exception class + constructor InputMismatchException();
               Constructor name must match the import name
             */
        }

        if(age > 21) {
            System.out.println("You are eligible.");
        }else{
            throw new RuntimeException("You must be at least 21 years old.");
        }
    }
}
