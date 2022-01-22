package day15_String_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        /* Before the loop is executed, this is the current maximum number.
        Any user entered number will be greater than -2147483648.           */

        for(int i = 0; i < 5; i++){
            System.out.println("Enter A number:");
            int num = scan.nextInt();                                                  /*
            The loop is executed 5 times. If the user enters 1, 2, 3, 4, 5:
            After the first execution of the loop, 1 is assigned to the variable max.
            After the second execution of the loop, 2 is assigned to the variable max.
            The loop will repeat until the 5th input. 5 is assigned to the variable max. */

            if(num > max){ // Condition is true if the user entered number greater than -214748684.
                max = num;

                System.out.println("max = "  + max);
            }
        }

        /*
        Write A program that asks the user to enter A number for 5 times.
        Return the maximum number.
         */
    }
}
