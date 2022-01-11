package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        /*
        5. Write a program that can find the unique characters from a string without using
        index() and lastIndexOf() methods.
        Ex:
        Input: str = "aabccdeef";
        Output: bdf

        Hint: if you find out how to find the frequency of one character, then you can repeat
        it for the remaining characters to find the frequency.

        if frequency of a character == 1  =========> unique

        Start by finding a frequency of the first character 'a'.
        Compare it with every single character from the string by using a For Loop.
        First count returns the frequency of char 'a'. To test b, change char to 'b'. */

        String str = "aabccdeef";
        String result = ""; // bdf

        for(int j = 0; j < str.length(); j++) { // Add outer loop after setting the inner loop

            char ch = str.charAt(j); // 'A'
            // char ch = 'a'; change to 'b', 'c', 'd', 'e', 'f'. Use str.charAt(j)
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { // Set up inner loop first
                // Compares the character that outer loop picked with each character of the string
                char each = str.charAt(i); // When this character matches each character of the string
                if (ch == each) {
                    count++;
                }
            }
            /*
            if (count == 1) { // If the frequency of the character is 1, then the character is unique
                result += ch;
            }                                                              */

            if (count != 1) {
                continue;
            }
            result += ch;
        }
        System.out.println(result); // bdf

    }
}
