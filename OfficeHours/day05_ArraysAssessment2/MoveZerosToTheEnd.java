package OfficeHours.day05_ArraysAssessment2;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        /*
        Write a program that can move all the zeros to the end of the array.
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
         */

        int [] array = {10, 0, 5, 0, 1, 0};

        int [] result = new int [array.length]; // {0, 0, 0, 0, 0, 0} result [10, 0, 0, 0, 0, 0]

        int i = 0;
        for (int each : array) {
            if(each != 0) {
                result[i] = each; // result[0] = 10, result[1] = 5, result[2] = 1
                i++;
            }
        }
        System.out.println(Arrays.toString(result)); // [10, 5, 1, 0, 0, 0]
    }
}