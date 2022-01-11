package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        /*
        Interview question
        1. Write a program that can divide two positive numbers without using / (division)
        and * (multiplication) operators.

        20 / 6 ==> 3 with the remainder of 2

        a = 20
        b = 6   // (3 * 6) = (6 + 6 + 6)  (18 / 6) = (18 - 6 - 6 - 6)

        a -= b; // a = 14
        a -= b; // a = 8
        a -= b; // a = 2                               */

        int a = 30; // a = 30 - 7 = 23 - 7 = 16 - 7 = 9 - 7 = 2
        int b = 7;

        int count = 0; // count = 1 + 1 = 2 + 1 = 3 + 1 = 4

        while(a >= b){
            a -= b; // a = a - b
            count++;
        }

        System.out.println(count + " with a remainder of " + a); // 4 with a remainder of 2

    }
}
