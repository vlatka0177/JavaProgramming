package OfficeHours.day02_IfStatementSwitchForLoopScanner;

import java.util.Scanner;

public class FirstTwoLetters {

    public static void main(String[] args) {

        /* (substring-length-isEmpty)

        Given A string, return the string made of its first two chars,
        so the String "Hello" yields "He". If the string is shorter than length 2,
        return whatever there is, so "X" yields "X", and the empty string "" yields
        the empty string "".

                              Input :"Hello"   → "He"
                              Input :"abcdefg" → "ab"
                              Input :"A"       → "A"
                              Input :""        → "It can not be empty"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word: ");

        String word = input.nextLine();

        if(word.isEmpty()){
            System.out.println("It cannot be empty.");
        }else if(word.length() <= 2) {
            System.out.println(word);
        }else{

        //  System.out.println(word.substring(0,2)); // string length

            System.out.println(word.charAt(0) + "" + word.charAt(1)); // index numbers
        /*  System.out.println("" + word.charAt(0) + word.charAt(1));
            Cannot add "" at the end of the concatenation.  */
        }

    }

}
