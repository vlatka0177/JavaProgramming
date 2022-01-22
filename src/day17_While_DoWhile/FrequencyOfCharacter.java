package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        /*
       1. Write A program that can return the frequency of A char from A String
		  Ex:
		  Input:   str = "AAABBBC"
				   ch = 'A'
		  Output: 3                                                */

        String str = "AAABBBC";

        char ch = 'B';

        int frequency = 0; // +1+1+1===>3

        for (int i = 0; i < str.length() ; i++) { // i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            if (ch == eachChar) { // If given ch is matching with the eachChar, then ch is in the string
                frequency += 1; // frequency++
            }
        }
        System.out.println(frequency); // 3

    }

}
