package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        /*
        Single If Statement
        Evaluates A condition.
        Even if the condition evaluates to true, all statements in the subsequent code block are executed.
        Used for one possible output.
        Multiple Single If statements can be created, but this is not efficient. Thus, it is not done.

        one condition ===> Single If Statement

        if(Condition){
        Statements
        }

        The body of the condition is executed between { and }.
         */

        int number = 300;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
        */

        boolean evenNumber = number%2 == 0; // no remainder when divided by 2
        boolean oddNumber = ! evenNumber; // not even number

        if(evenNumber){
            System.out.println(number + " is even number");
        }                                                    // true

        if(oddNumber) {
            System.out.println(number + " is odd number");
        }                                                    // false

        // Only the true statement is printed.

        System.out.println("----------------------------------------");

        int n = 200;

        // positive
        if(n > 0){
            System.out.println(n + " is positive");
        }
        // if n is greater than zero, then it is positive

        // negative
        if(n < 0){
            System.out.println(n + " is negative");
        }
        // if n is less than zero, then it is negative

        // zero
        if(n == 0){
            System.out.println(n + " is equal to zero");
        }

    }
}
