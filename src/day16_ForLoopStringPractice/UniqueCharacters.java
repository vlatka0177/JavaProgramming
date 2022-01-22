package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

         /*
         2. Write A program that can return the unique characters from A String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
         */

        String str = "aaabccc";
        //   index    0123456

        String result = ""; // the purpose is to store the temporary value

        for (int i = 0; i < str.length(); i++) {
            // i: index numbers of str, starting from 0

            // Is A unique? Is B unique? Is c unique?
            char ch = str.charAt(i);
            // ch: each character of str

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                /*
        Create A loop to repeat the process for all seven characters, from index 0 to index 6.
        If the first and the last index number of the character are the same,
        then the character is unique.
        The first A is at index 0, the second A at index 1 and the last A at index 2. Not unique.
        B is at index 3. There is no other B at any other index. B is unique.
        The first c is at index 4, the second c at index 5, and the last c at index 6. Not unique.
         */

                result += ch;
            }

        }

        System.out.println(result);

    }
}
