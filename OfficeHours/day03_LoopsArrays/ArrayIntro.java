package OfficeHours.day03_LoopsArrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // Arrays
        String[] color = {"Yellow", "Blue", "Purple"};
        //                    0        1        2

        String[] color2 = new String[3];
        color2[0] = "Red";
        color2[1] = "Orange";
        color2[2] = "Green";

        System.out.println(Arrays.toString(color2));
        System.out.println(color2[1]);

        // Finding the array size.
        System.out.println(color.length);

        // Equals Method: compares two arrays.
        int[] num = new int[4]; // Length of the array is 4
        num[0] = 42;
        num[1] = 35;
        num[2] = 12;
        num[3] = 9;

        System.out.println(Arrays.toString(num));

        int[] num1 = {1, 2, 3, 4};
        System.out.println("Arrays.equals(num, num1 = " + Arrays.equals(num, num1));

        // Sorting Method
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }

}
