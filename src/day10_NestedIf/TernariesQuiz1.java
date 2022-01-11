package day10_NestedIf;

public class TernariesQuiz1 {

    public static void main(String[] args) {

        float f1 = (12_345.1>123_45.0)? 12_456 : 114_56.02f;
        float f2 = f1 + 1024;
        System.out.println(f2); // 13480.0

        /*
        Ternaries are shortened If Statements. Take all data types.
        Underscore could be placed anywhere, so don't assume it is in the place of a comma.
         */
    }
}
