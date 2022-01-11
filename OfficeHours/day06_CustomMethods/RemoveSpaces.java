package OfficeHours.day06_CustomMethods;

import java.util.Arrays;

public class RemoveSpaces {

    /*
    Write a method that can remove all extra spaces from String.
    Input: "   Hello world   I   love   Java   "
    Output: hello world I love Java                           */

    public static void main(String[] args) {

        String input = "   Hello world   I   love   Java   ";
        removeSpaces(input);
    }

    public static void removeSpaces(String str) {
        String result = "";
        String[] strArr = str.trim().split(" ");
        System.out.println(Arrays.toString(strArr)); // [Hello, world, , , I, , , love, , , Java]

        for(String each : strArr) {
            if(!each.isEmpty()) { // each of the array string that is not empty;
                result += each + " "; // result = result + each of the array string + empty space between each
            }
        }
        System.out.println(result); // Hello world I love Java
    }
}
