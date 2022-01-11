package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        /*
        You are writing a code for the log-in function of the Cydeo Application.
        Assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        If the credentials are not matched, the program should allow the user to have three attempts
        to enter correct credentials and if all three attempts are failed, then print
        "Your account is locked."
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if( u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {

            for (int i = 1; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username:");
                u = scan.next();
                System.out.println("Enter your password:");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged In");
                    break;
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked. Please contact support team.");
            }
        }


    }
}
