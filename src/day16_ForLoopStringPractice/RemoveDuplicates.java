package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

          /*
        1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each character of the string into another String
            Condition: the character is not contained in the other String before you add it
         */

        String str = "aabbaacc";

        String result = ""; /* No character is contained in the result.
                               Adds abc in the end.

                       i <= 7 or i < 8                              */
        for(int i = 0; i <= str.length()-1; i++) {
            // i: represents all the index numbers of str, starting from 0

            String ch = "" + str.charAt(i); // represents each character of str

            // System.out.println(ch)    Not needed. Shows that each character is represented.

            if (!result.contains(ch)) {
                /* if the result does not contain a character, the character is added to the string variable.
                First execution: if the result does not contain a, a is added to the string variable result.
                Second execution: the string variable result already has a character a. Condition false.
                Third execution: if the result does not contain b, b is added to the string variable result.
                Fourth execution: the string variable result already has a character b. Condition false.
                Fifth execution: if the result does not contain c, c is added to the string variable result.
                Sixth execution: the string variable result already has a character c. Condition false.
                */
                result += ch;
            }
        }

            System.out.println(result);
        // 'A' ==> "A"

    }
}
