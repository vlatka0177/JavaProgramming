package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 0, 1, 2, 20, 4, 6, 7, 8};

        Arrays.sort(numbers); // Sorts the array in ascending order

        System.out.println(Arrays.toString(numbers)); // [0, 1, 2, 4, 6, 7, 8, 9, 10, 20]

    }
}
