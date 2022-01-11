package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");

        int length = scan.nextInt();
        /* Variable name needs to have a meaning: length of the array.
        User input determines the length of the array. */

        if(length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0); // Terminates the entire program
        }

        int[] numbers = new int[length];
        /* The array needs to have enough capacity to contain all elements that user is going to input.
           [0,  0,  0,  0,  0] Length of the array is 5. It can store only 5 elements.               */

        for(int i = 0; i< length; i++){ // i: 0, 1, 2, 3, 4
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            /*Each input user provided during each execution of the loop, will be assigned to the indexes of the array.
              User enters 10, 20, 30, 40, 50. Loop repeats 5 times and assigns the user entered numbers to indexes     */
        }
        System.out.println(Arrays.toString(numbers)); // [10, 20, 30, 40, 50]

        scan.close();

    }

}
