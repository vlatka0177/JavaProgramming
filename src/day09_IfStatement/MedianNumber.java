package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        /*
        2. Create a class called MedianNumber.
        Write a program that can find the median number between three DIFFERENT given integers.

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

            Possibility #1: a could be a median number
            Possibility #2: b could be a median number
            Possibility #3: c could be a median number
         */

        int a = 10,
                b = 15,
                c = 20;   /* One data type is used for all three variables

        If there are three different numbers, one MUST be maximum, one MUST be minimum, and
        one MUST be median. */

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        For a to be the median number:
        1. If c is the maximum number and b is the minimum number, then a is the median number. OR
        2. If c is the minimum number and b is the maximum number, then a is the median number.
         */

        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);

        //boolean cisMedian = (c > b && c < a) || (c > a && c < b);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian){      // If a is the median number
            System.out.println(a + " is the median number.");
        }

        if(bIsMedian){      // If b is the median number
            System.out.println(b + " is the median number.");
        }

        if(cIsMedian){      // If c is the median number
            System.out.println(c + " is the median number.");
        }

    }
}
