package day15_String_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;                                       /*
        Any number that user enters will be less than 2147483647
        After the first execution, 67 is assigned to the variable min
        After the second execution, 23 is assigned to the variable min.
        After the third execution, 23 stays assigned ot the variable min.
        After the fourth execution, 5 is assigned ot the variable min.
        After the fourth execution, -10 is assigned ot the variable min.
        */

        for (int i = 10; i < 15; i++) {
            // Loop is repeated 5 times. 10th, 11th, 12th, 13th, 14th
            System.out.println("Enter a number:");
            int num =scan.nextInt(); // User enters 67, 23, 42, 5, -10

            if(num < min){
                min = num;
            }

        }
        System.out.println("min = " + min);

    }
}
