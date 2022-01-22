package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        /*
    2. Write A program that asks user to enter A number, and check if the number is odd or even.
       If it's odd, print "Odd Number"
       If it's even, print "Even number"
       Ask the user "Would you like to enter another number"
       If user enters yes, repeat the previous steps
       If user enters no, print nothing
       If user enters invalid answer, repeat the previous steps            */

        Scanner scan = new Scanner(System.in);

    while(true) {
        System.out.println("Enter A number");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
        System.out.println("Would you like to enter another number?");
        String a = scan.next().toLowerCase();

        while (!(a.equals("yes") || a.equals("no"))) { //if the answer is invalid (not yes or no)
            System.err.println("Please re-enter. Would you like to enter another number? ");
            a = scan.next().toLowerCase();
        }

        if (a.equals("no")) {
            break;
        }
    }

    }
}
