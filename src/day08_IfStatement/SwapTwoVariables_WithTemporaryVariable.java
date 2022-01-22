package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        /*
        1. Write A program that can swap the value of two variables by using A temporary variable

		   Input:
		        A = 10
		        B = 15

		    output:
		        A = 15
		        B = 10
         */

        int a = 10;
        int b = 15;

        int c = b; // temporary variable c = 15
        b = a; // B = 10
        a = c;

        System.out.println("A = " + a); // 15
        System.out.println("B = " + b); // 10
    }
}
