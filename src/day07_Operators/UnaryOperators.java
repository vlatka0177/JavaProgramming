package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        /*
        Unary Operators:
        + Unary Plus Operator
        - Unary Minus Operator
        */

        int num1 = +25; // Optional operator
        int num2 = -25; // Required operator

        System.out.println( num1 < 0 ); // false
        System.out.println( num1 > 0 ); // true

        System.out.println("--------------------------------------------------------");

        /*
        ++ Increment Operator  Increases value by 1
        -- Decrement Operator  Decreases value by 1

        Pre Increment/Decrement
        Increment/decrement operators are placed before the operand.
        Increase/decrease the value by 1 immediately.
         */

        int p = 25;
        System.out.println(++p); // 26
        System.out.println(--p); // 25

        System.out.println("---------------------------------------------------------");

        int a = 5;
        ++a; // Pre increment: increases the value by 1 immediately

        System.out.println(a); // 6

        --a; // Pre decrement: decreases the value by 1 immediately

        System.out.println(a); // 4

        System.out.println("--------------------------------------------------------------");

        /*
        Post Increment/Decrement Operators
        Increment/decrement operators are placed after the operand.
        Old value of the variable will be used first and the increase/decrease stored in the
        memory to be used in the second step.
         */

        int r = 25;
        System.out.println(r++); // 25
        System.out.println(r--); // 26
        System.out.println(r); // 25

        System.out.println("--------------------------------------------------------------");

        int b = 100;

        System.out.println(++b); // 101 Pre increment increases the value by 1 immediately

        int c = 100;

        System.out.println(c++); // 100 Post increment increases the value by 1 in the second step
        System.out.println(c); // 101

        int x = 200;

        System.out.println(--x); // 199 Pre decrement decreases the value by one immediately

        int y = 200;

        System.out.println(y--); // 100 Post decrement decreases the value by 1 in the second step
        System.out.println(y); // 199

        System.out.println("---------------------------------------------------------------");

        int z = 45;

        System.out.println(++z); // 46, z=46 Pre increment increases the value by 1 immediately
        System.out.println(z++); // 46 Post increment passes the current value in the first step.
        System.out.println(z); // 47 Post increment increases the value by 1 in the second step

        int q = 30;

        System.out.println(--q); // 29, q=30 Pre decrement decreases the value by 1 immediately
        System.out.println(q--); // 29 Post decrement passes the current value in the first step.
        System.out.println(q); // 28 Post decrement decreases the value by 1 in the second step.

    }
}
