package day15_String_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter A word:");
        String word = new Scanner(System.in).next(); // xcodex

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "A"); // "acodex"
        }

        System.out.println(word);

        /*
  1. Write A program that asks user to enter A word. If the work starts with x, replace it with A.
                    Input:
                        xcodex
                    Output:
                        acodex
         */


    }

}
