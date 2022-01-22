package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        /*
        1. Write A program for the  marriage proposal program asking the user, "Will you marry me?"
           If the answer is yes, print "Congrats."
           If the answer is no, print "Goodbye"
           If the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it
           until the user enters either yes or no.            */

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me? Yes/No");

        String a = scan.next().toLowerCase();

        while(!(a.equals("yes") || (a.equals("no")))){
            System.out.println("Invalid answer. Please re-enter");
            a = scan.next().toLowerCase();
        }

        if(a.equals("yes")){
            System.out.println("Congratulations");
        }else{
            System.out.println("Goodbye");
        }

    }

}
