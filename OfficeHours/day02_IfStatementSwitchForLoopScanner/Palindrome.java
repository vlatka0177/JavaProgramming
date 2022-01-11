package OfficeHours.day02_IfStatementSwitchForLoopScanner;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        /*
        Write a program that can check if the given String is a palindrome.

         Ex:
         input:
            Level

         output:
            true

         input:
            Anna

          output:
             true

          Loop checks each index, each char in the string.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word: ");

        String word = input.nextLine();

        String result = ""; // Empty string will not change the result.

        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(result);

        System.out.println(isPalindrome);


    }

}
