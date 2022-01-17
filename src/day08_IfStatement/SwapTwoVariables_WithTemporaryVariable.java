package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        /*
        1. Write a program that can swap the value of two variables by using a temporary variable

		   Input:
		        a = 10
		        b = 15

		    output:
		        a = 15
		        b = 10
         */

        int a = 10;
        int b = 15;

        int c = b; // temporary variable c = 15
        b = a; // b = 10
        a = c;

        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10
    }
}
