package OfficeHours.day02_IfStatementSwitchForLoopScanner;

import java.util.Scanner;

public class FibonacciForLoopSolution {

    public static void main(String[] args) {

        /*
        Create a program that will give you the Fibonacci numbers up to the x value.

        Fibonacci is a sequence of numbers, starting from 0 and 1,
        where the following numbers are the sum of the previous 2 numbers.

        Note: Fibonacci numbers are read as index values,
        so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        Ex:
                 Input:
                 8
                 Output:
                 0, 1, 1, 2, 3, 5, 8, 13

                 index     values
                  0         0
                  1         1
                  2         1      index 0 + index 1
                  3         2      index 1 + index 2
                  4         3      index 2 + index 3
                  5         5      2 + 3
                  6         8      3 + 5
                  7        13      5 + 8
                  8        21      8 + 13
                       */

        Scanner input = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers do you want to see: ");

        int number = input.nextInt();

        int num1 = 0;
        int num2 = 1;
        int result = 0;  // What number will not change the result when I add another number: 0

        System.out.println(num1); // prints 0
        System.out.println(num2); // prints 1
        // if user wants to see 8 Fibonacci numbers, 6 more numbers will be printed
        // if user wants to see 4 Fibonacci numbers, 2 more numbers will be printed

        for (int i = 2; i < number; i++) { // 3rd index = 2 (already printed index 0 and 1)
            result = num1 + num2; // 0 + 1 = 1

            System.out.println(result);

            num1 = num2; // num1 = 1, the way to assign numbers
            num2 = result; // num2 = 1, will continue swapping numbers

        }


    }
}
