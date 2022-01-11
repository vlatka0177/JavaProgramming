package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        /*
        String Methods:

        1. charAt(index): returns the character at the given index, returns char

        String str = "Cydeo"
                      01234
         str.charAt(2) ===> 'd'

         String s = "Python"
         s.charAt(3) ===> 'h'
         */

        String word = "Cydeo";
        //index:       01234

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("----------------------------------------");

        // 2. lastIndexOf()

        String s1 = "Batch 25 is the best batch.";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);
        /* subtract 1 from the total number of characters to find the last index number
        Formula: s1.length()-1
        */
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------------------------------");

        /*
        3. toUpperCase()
        Returns new String in the upper case version of old string object.
        */

        String str = "wooden spoon"; // immutable
        str = str.toUpperCase(); // 'WOODEN SPOON'
        // If same variable is to reference to the same object, MUST assign it back (here str).

        System.out.println(str);

        String s = "JAVA";
        s.toUpperCase();

        System.out.println(str);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);


        /*
        4. toLowerCase()
        Returns new String in the lower case version of old string object.

        5. equals()
        Checks if the two strings have the same text.
        Returns a Boolean.
        */

    }

}
