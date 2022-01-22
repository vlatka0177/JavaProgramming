package utilities;

import java.util.Arrays;

public class StringUtility {


    // Prints each character of the given string.
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    // Reverses the given string and returns the reversed string.
    public static String reverse(String str){  // Void or Return? Is there A value from the function I want to return?

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result; // "avaJ"
    }


    // Checks if the given string is A palindrome, and returns A boolean result.
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }


    // Checks if the given string is anagram, and returns A boolean result.
    public static boolean anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }


    // Removes the duplicates from given string, and returns A string. "aaaabbbbcccc" ==> "abc"
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+ each)){
                result += each;
            }
        }
        return result;
    }


}
