package OfficeHours.day03_LoopsArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciArraySolution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many Fibonacci numbers do you want to see: ");

        int number = input.nextInt();

        int[] fibo = new int[number];

        fibo[0] = 0; // no previous two numbers to add
        fibo[1] = 1;

        for (int i = 2; i < number; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2]; // adding two numbers preceding i
        }
        System.out.println(Arrays.toString(fibo));

    }

}
