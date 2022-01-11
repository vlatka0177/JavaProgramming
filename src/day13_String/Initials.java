package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        /*
        Task:
         initial:
         firstName = "Wooden";
         lastName =  "Spoon";
         output:
         W.S.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); // "Java"

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        /*
        To apply concatenation, there must be a string on the left and right.
        String initial = ""+ f + l;  Here, concated to an empty string.
        */
        String initial = f + "." + l + ".";



    }
}
