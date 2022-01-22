package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        /* Interview Question
        2. Write A program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
         */

        String sentence = "I Love Java";

        String[] words = sentence.split(" "); // [I, Love, Java]

        String reverse = " ";

        for (int i = words[1].length() - 1; i >= 0; i--) {
            // initialization from last index (e) of the word 1 (Love)
           reverse += words[1].charAt(i);
        }

        System.out.println(reverse); //  evoL

      //  sentence = sentence.replaceFirst(words[1], reverse);

        words[1] = reverse;

        System.out.println(Arrays.toString(words)); // [I,  evoL, Java]

        String result = " ";
        for (String word : words) {
            result += word + " ";
        }

        System.out.println(result); //  I  evoL Java

    }

}
