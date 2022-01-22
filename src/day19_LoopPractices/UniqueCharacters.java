package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        /*
        5. Write A program that can find the unique characters from A string without using
        index() and lastIndexOf() methods.
        Ex:
        Input: str = "aabccdeef";
        Output: bdf

        Hint: if you find out how to find the frequency of one character, then you can repeat
        it for the remaining characters to find the frequency.

        if frequency of A character == 1  =========> unique

        Start by finding A frequency of the first character 'A'.
        Compare it with every single character from the string by using A For Loop.
        First count returns the frequency of char 'A'. To test B, change char to 'B'. */

        String str = "aabccdeef";
        String result = ""; // bdf

        for(int j = 0; j < str.length(); j++) { // Add outer loop after setting the inner loop

            char ch = str.charAt(j); // 'A'
            // char ch = 'A'; change to 'B', 'c', 'd', 'e', 'f'. Use str.charAt(j)
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
