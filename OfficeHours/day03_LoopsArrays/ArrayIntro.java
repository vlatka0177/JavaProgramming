package OfficeHours.day03_LoopsArrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // Arrays
        String[] animals = {"Dog", "Cat", "Parrot"};
        //                    0      1       2

        String[] color = new String[3];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Green";

        System.out.println(Arrays.toString(color)); // [Red, Orange, Green]
        System.out.println(color[1]); // Orange

        // Finding the array size.
        System.out.println(color.length); // 3

        // Equals Method: compares two arrays.
        int[] num = new int[4]; // Length of the array is 4
        num[0] = 42;
        num[1] = 35;
        num[2] = 12;
        num[3] = 9;

        System.out.println(Arrays.toString(num)); // [42, 35, 12, 9]

        int[] num1 = {1, 2, 3, 4};
        System.out.println("Arrays.equals(num, num1) = " + Arrays.equals(num, num1));

        // Sorting Method
        Arrays.sort(num);
        System.out.println(Arrays.toString(num)); // [9, 12, 35, 42]

    }

}
