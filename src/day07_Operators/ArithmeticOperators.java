package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

         /*
        Arithmetic Operators are:
        + Addition
        - Subtraction
        * Multiplication
        / Division
                in Math:
                20/6 = 3.333

                in Java:
                20/6 = 3 Gives an integer number.
                integer / integer ====> integer

                Decimal result if either a numerator or a denominator are a decimal number.

                20.0/6 = 3.333     decimal / integer ====> decimal
                20/6.0 = 3.333     integer / decimal ====> decimal
                20.0/6.0 = 3.333   decimal / decimal ====> decimal

        %: Remainder/Modulus
        remainder = numerator - (denominator * integer result)
                    10        - (3 * 3) = 1

                    1/3 = 0.3333
                    10 % 3 =======> 1

                    45 / 8 =5.625
                    45
        */


        int num1 = 10; // The value of num1 and num2 can change
        int num2 = 3;

        // 10 divided by 3 is 3 with a remainder of 1

        int division = num1/num2; // Division variable contains the result of num1 divided by num2
        int remainder = num1%num2; // Remainder variable contains the remainder of num1 divided by num2

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder + ".");

        // What is the remainder of 25 divided by 4

        System.out.println(25 % 4);
        System.out.println(25 % 5);


    }
}
