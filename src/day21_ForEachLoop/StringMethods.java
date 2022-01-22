package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        /*
        String Methods

        1. toCharArray()
           Returns A char array
           "abc".toCharArray() ====> {'A', 'B', 'c'}
         */

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars)); // [J, A, v, A]

        for(char each : chars) {
            System.out.println(each); // J A v A
        }

        System.out.println("--------------------------------------------------------------");


        /*
        2. split(value)
        Returns String array.

        "I love learning Java programming language.".split(" ") ==> {"I", "love", "learning",
        "Java", "programming", "language"}

        "ABC".split(" ") {"A", "B", "C"}
         */

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); // [Wooden, Spoon]

        System.out.println("--------------------------------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr)); // [WoodenSpoon, cydeo.com]

        System.out.println("--------------------------------------------------------------");

        String s = "Today is A nice day. Today is Monday. Today we learn Java";

        String[] sentences = s.split("\\."); // If split by A dot, need to add \\

        System.out.println(Arrays.toString(sentences)); // [Today is A nice day,  Today is Monday,  Today we learn Java]

    }

}
