package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        /*
    2. Write a program that asks user to enter a number, and check if the number is odd or even.
       If it's odd, print "Odd Number"
       If it's even, print "Even number"
       Ask the user "Would you like to enter another number"
       If user enters yes, repeat the previous steps
       If user enters no, print nothing
       If user enters invalid answer, repeat the previous steps            */

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.err.println("Would you like to enter another number?");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                // if the answer is not yes or no (invalid)
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you!");
                break;
            }
        }

    }
}
