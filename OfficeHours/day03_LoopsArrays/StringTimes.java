package OfficeHours.day03_LoopsArrays;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {

        /*
        Given A string and A non-negative int num, return A larger string that copies the number
        of times that is int num.

        input String: Hi, input int: 3
        Output: HiHiHi
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String word = input.nextLine();

        System.out.println("Enter any positive number: ");
        int num = input.nextInt();

        int count = 0;
        String sum = "";

        while(count < num) {
            sum += word; // If num is 3, String sum = "Ho" + "Ho" + "Ho"
            count++;
        }
        System.out.println(sum);

        /*
        for (int i = 0; i < num; i++) { // Loop repeats until the condition i < num is false.
            sum += word;
        }
        System.out.println(sum);
         */

    }

}
