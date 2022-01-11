package day20_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Scanner + enter, automatically creates import java.util.Scanner;

        /*
        3. Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number                                 */

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter a Number:");

            numbers[i] = scan.nextInt(); // Each user input will be assigned to the indexes of the array numbers
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

            System.out.println("numbers = " + Arrays.toString(numbers));
            // numbers = [77, 87, 56, 92, 64, 69, 12, 2, 64, 49]
            System.out.println("min = " + min); // min = 2
            System.out.println("max = " + max); // max = 92

    }
}
