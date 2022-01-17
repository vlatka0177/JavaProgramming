package OfficeHours.day01;

public class CastingExpPractice {

    public static void main(String[] args) {

        // double > float > long > int > short > byte

       double num = 12;
       int num2 = (int)num; // Explicit casting. Done by the developer.

        short num4 = 34;
        int num5 = num4; // Implicit casting. Done by compiler.

        byte num8 = 127;
    }

}
