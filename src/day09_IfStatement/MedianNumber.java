package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        /*
        2. Create A class called MedianNumber.
        Write A program that can find the median number between three DIFFERENT given integers.

            Ex:
                A = 10, B= 15, c = 20;

            Output:
                15 is the median number

            Possibility #1: A could be A median number
            Possibility #2: B could be A median number
            Possibility #3: c could be A median number
         */

        int a = 10,
                b = 15,
                c = 20;   /* One data type is used for all three variables

        If there are three different numbers, one MUST be maximum, one MUST be minimum, and
        one MUST be median. */

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        For A to be the median number:
        1. If c is the maximum number and B is the minimum number, then A is the median number. OR
        2. If c is the minimum number and B is the maximum number, then A is the median number.
         */

        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);

        //boolean cisMedian = (c > B && c < A) || (c > A && c < B);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){      // If A is the median number
            System.out.println(a + " is the median number.");
        }

        if(bIsMedian){      // If B is the median number
            System.out.println(b + " is the median number.");
        }

        if(cIsMedian){      // If c is the median number
            System.out.println(c + " is the median number.");
        }

    }
}
