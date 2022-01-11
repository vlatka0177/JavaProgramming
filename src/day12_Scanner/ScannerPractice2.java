package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Enter true or false:");

        boolean result = input.nextBoolean();  Boolean method returns input as true or false.
         */
        System.out.println("Enter your name:");

        String name = input.next();   /* Next method reads the input only till the space.
                                         Used only when input is one word. */

        System.out.println("name = " + name);

        // Close the scanner.

        input.close();

    }

}
