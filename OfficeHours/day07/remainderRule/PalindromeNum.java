package OfficeHours.day07.remainderRule;

public class PalindromeNum {

    public static void main(String[] args) {

        System.out.println(isPalNum(545));
    }

    public static boolean isPalNum(int num) {
        // To get the most right number, 'num % 10'
        // To remove the most right number, 'num / 10'

        int copyOfOriginal = num; // copyOfOriginal: 545
        int reversedNumber = 0; // reversedNumber: 545
        int remainder;

        while(num > 0) {
            remainder = num % 10; // num: 54, then 5

            reversedNumber = (reversedNumber * 10) + remainder; // reversedNumber: 5 remainder: 4
                                                               //  reversedNumber: 545 remainder: 5
            num = num / 10; // num: 54, then num: 5
        }
        return reversedNumber == copyOfOriginal;
        // If the reversed and original version are equal, it is a palindrome.
    }
}
