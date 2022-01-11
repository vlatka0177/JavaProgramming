package day12_Scanner;

/* Scanner is used for getting user inputs. It also reads files.
   It needs to be imported from "java.util" package.

   Syntax of the import statement:
                 import package.class;
                            |       |
                 import java.util.Scanner;

import java.util.*;  Wild import: imports everything from the package.
                     Uses more resources (memory), which costs money. */

import java.util.Scanner; // Regular import: only imports a class that is needed.

public class ScannerPractice {

    public static void main(String[] args) {

        // Assign the scanner object to the scanner variable. It makes data reusable.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7:");

        /* Preferred methods for numbers are:
           - nextInt()
           - nextDouble()
           Other highly used methods:
           - nextBoolean()
           - next()
           - nextLine()  */

        int num = scan.nextInt();

        String result = ""; // Always assign a temporary value "" to prevent errors.

        if(num >= 1 && num <= 7) {

           result = (num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday" :(num==4)?"Thursday"
                    :(num==5)?"Friday" :(num==6)?"Saturday" :"Sunday";

           /*    ()?            :()?          :
                  |              |            |          Ternary
                  If          Else...If      Else
            */

        }else{
            result = "Invalid Number";
        }

        scan.close();






    }
}
