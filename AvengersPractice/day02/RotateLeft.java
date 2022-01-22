package AvengersPractice.day02;

import java.util.Scanner;

public class RotateLeft {

    public static void main(String[] args) {

        /*
        Move the first two characters of the string to the end of the string
        Input: hello   Output: lloHe
        Input: java    Output: vaja
        */


        Scanner input = new Scanner (System.in);
        System.out.println("Enter A word: ");
        String word = input.next();

        // Substring Solution

        String result = word.substring(2) + word.substring(0,2);
                   //     "llo"               "He"

        System.out.println("result = " + result);

        System.out.println("--------------------------------------------");

        // For Loop Solution

        String result1 = "";
        String result2 = "";

        for (int i = 0; i < 2; i++) {

            result1 += word.charAt(i);
        }

        for (int i = 2; i < word.length(); i++) {

            result2 += word.charAt(i);
        }

        System.out.print("result = " + result2 + result1);

    }

}
