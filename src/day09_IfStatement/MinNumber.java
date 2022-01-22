package day09_IfStatement;

public class MinNumber {

    public static void main(String[] args) {

        /*
        1. Create A class called MinNumber.
        Write A program that can print the minimum number between two numbers.
        If both are equal then print Equal.

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number

            Possibility #1: n1 is the minimum number
            Possibility #2: n2 is the minimum number
            Possibility #3: n1 and n2 are equal
         */
        int n1 = 100,
            n2 = 200;  // One data type is used for both variables

        if (n1 < n2) {          // Advanced and simpler way of completing the task.
            System.out.println(n1 + " is the minimum number");
            }

            // OR A step by step way

            boolean n1IsMin =  n1 < n2;
            boolean n2IsMin = n2 < n1;
            boolean equal = n1 == n2;

            if(n1IsMin){        // If n1 is the minimum number
                System.out.println(n1 + " is the minimum number");
            }

            if(n2IsMin){        // If n2 is the minimum number
                System.out.println(n2 + " is th minimum number");
            }

            if(equal){          // If n1 is equal to n2
                System.out.println("Equal");
            }
            // Whichever if statement is true gets executed.



    }
}
