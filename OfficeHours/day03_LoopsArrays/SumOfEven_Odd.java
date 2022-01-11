package OfficeHours.day03_LoopsArrays;

public class SumOfEven_Odd {

    public static void main(String[] args) {

        // Write a program using while loop that calculates the sum of even numbers between 0 and 10.

            int sumOfEven = 0;
            int sumOfOdd = 0;
            int i = 0;

            do{
                if (i % 2 == 0) {
                sumOfEven += i;
                } else {
                sumOfOdd += i;
                }
                i++;
            }
            while(i <= 10);

        System.out.println("Sum of even numbers is = " + sumOfEven);
        System.out.println("Sum of odd numbers is = " + sumOfOdd);

    }

}
