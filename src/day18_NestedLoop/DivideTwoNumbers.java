package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        /*
        Interview question
        1. Write A program that can divide two positive numbers without using / (division)
        and * (multiplication) operators.

        20 / 6 ==> 3 with the remainder of 2

        A = 20
        B = 6   // (3 * 6) = (6 + 6 + 6)  (18 / 6) = (18 - 6 - 6 - 6)

        A -= B; // A = 14
        A -= B; // A = 8
        A -= B; // A = 2                               */

        int a = 30; // A = 30 - 7 = 23 - 7 = 16 - 7 = 9 - 7 = 2
        int b = 7;

        int count = 0; // count = 1 + 1 = 2 + 1 = 3 + 1 = 4

        while(a >= b){
            a -= b; // A = A - B
            count++;
        }

        System.out.println(count + " with A remainder of " + a); // 4 with A remainder of 2

    }
}
