package day07_Operators;

public class Casting {

    public static void main(String[] args) {

        /*
        What we have learnt so far:
        1. main method
        2. print() does not append a line and println() appends a line
        3. escape sequences
        4. primitives and String variables
        5. concatenation
        6. Castings (explicit)
         */

        /*
        1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
         */

        float averageScore = 20.5f;
        byte num1 = (byte) averageScore; // Explicit casting, done manually
        short num2 = (short) averageScore; // After ; press Option and then Enter for Explicit casting
        int num3 = (int) averageScore;
        long num4 = (long) averageScore;
        float num5 = averageScore; // No casting
        double num6 = averageScore; // Implicit casting, done automatically

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


        /*
        double > float > long > int > short > byte

        Smaller primitive type can be assigned to the larger primitive type. Implicit casting.

        Larger primitive type can not be assigned to the smaller primitive type. Explicit casting,
        which has to be done manually.
         */

    }

}
