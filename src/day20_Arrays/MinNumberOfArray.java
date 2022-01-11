package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {100, 500, 30, 40, 600, 80, -90};

        int min = numbers[0];
        /* Assumption that the first number, 100, is the minimum number.
        The loop executes.
        Every element is compared to the previous one.
        Smaller number replaces the greater one and is assigned to min. */

        for (int i = 0; i < numbers.length; i++) { // i: 0, 1, 2, 3, 4, 5, 6...
            // Type fori, and loop will be created automatically.

            if(numbers[i] < min){ // If there is an element in the array that's smaller
                min = numbers[i]; // Smaller number will be assigned to the variable min
            }
        }
        System.out.println("Minimum number = " + min); // Minimum number = -90
    }

}
