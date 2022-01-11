package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        /*
        1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";
			output:
				Java learn to day good a is Today
         */

        String sentence = "Today is a good day to learn Java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); // [Today, is, a, good, day, to, learn, Java]

        String reversedSentence = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }

        System.out.println(reversedSentence); // Java learn to day good a is Today

    }

}
