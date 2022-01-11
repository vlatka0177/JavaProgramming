package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        // Check if someone is eligible to vote.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        while(!(age >= 1 && age <= 120)){ // while the age number is invalid
            System.err.println("Invalid entry. Please re-enter.");
            System.err.println("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("Are you a U.S. citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid Entry. Please re-enter.");
            System.err.println("Are you a U.S. citizen? yes/no");
            answer = scan.next().toLowerCase();
        }

        if (age >= 18 && answer.equals("yes")){
            System.out.println("You are eligible to vote.");
        }

    }
}
