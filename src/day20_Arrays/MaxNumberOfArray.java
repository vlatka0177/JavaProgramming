package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int max = numbers[0];
        /*
        Start with the assumption that the first number, 10, is the maximum.
        Then, compare it with every element in the array.
        If greater than the current maximum number, that greater number will be assigned to the
        variable max.
        At the fourth execution of the loop, the current maximum number 10 is replaced with 20.
        By the time the loop ends, the maximum number will be assigned to max.
        */

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) { // If there is element in the array that's greater than the current max number
                max = numbers[i]; // Assign greater number to variable max
            }
        }
        System.out.println("Maximum number = " + max); // Maximum number = 20

    }

}
