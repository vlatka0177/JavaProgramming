package OfficeHours.day02_IfStatementSwitchForLoopScanner;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        /* Write a program that can return the factorial number of any given number

            Ex:
            input: 5
            output: 120  ( because: 5! = 5 * 4 * 3 * 2 * 1 = 120 )

            Factorial number of 3 is the result of  3 * 2 * 1
            Factorial number of 4 is the result of  4 * 3 * 2 * 1

            Factorial numbers can only be calculated with positive numbers (>=1)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = input.nextInt();

        int result = 1; /* What number will not change the result when I
                           multiply with another number: 1               */

        if(number > 2){
            for (int i = number; i >= 1; i--) {
                result *= i; // result = result * i;  1 * 5 = 5
                             // next loop, result * i = 4,  5 * 4
                             // result = 5 * 4 * 3 * 2 * 1
            }
     /*   }else{
                  result = number;  */
        }

        System.out.println("Factorial number = " + result);

    }
}
