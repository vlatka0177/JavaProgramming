package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        /*
        +: Addition
        -: Subtraction
        *: Multiplication
        /: Division
                in math:
                10/4 = 2.5

                in Java:
                10/4 = 2    Gives an integer number.
                10.0/4 = 2.5   Decimal result if either a numerator or a denominator are a decimal number.

                integer / integer ====> integer
                decimal / integer ====> decimal
                integer / decimal ====> decimal
                decimal / decimal ====> decimal
        %: Remainder
        */

        System.out.println("12" + 1); // 121, Concatenation
        System.out.println(10 + 20); // 30, Addition
        System.out.println(100 - 50); // 50, Subtraction
        System.out.println(10 * 6); // 60, Multiplication

        System.out.println(100 / 3 ); // 33
        System.out.println(10.0 / 4); // 2.5
        System.out.println(10 / 4.0); // 2.5
        System.out.println(10d / 4); // 2.5

        int a = 100;
        double b = a/6; // 16.0

        System.out.println(b);

        double c = a/6.0; /* 16.66666
        OR
        double c = (double)a/6; 16.66666  */

        System.out.println(c);


    }
}