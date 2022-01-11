package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /*
         Interview question
         Write a program that can check if str1 & str2 are build out of the same characters.
         */

        String str1 = "acdb";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1)); // [a, c, d, b]
        System.out.println(Arrays.toString(ch2)); // [d, b, c, a]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1)); // [a, b, c, d]
        System.out.println(Arrays.toString(ch2)); // [a, b, c, d]

        boolean anagram = Arrays.equals (ch1, ch2);

        System.out.println("anagram = " + anagram); // anagram = true

    }
}
