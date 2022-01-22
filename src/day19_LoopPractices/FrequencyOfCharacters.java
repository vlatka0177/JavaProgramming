package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        /*
        4. Write A program that can find the frequency of the characters from A string
			Ex:
            Input: str = "aabcccd";
            Output: a2b1c3d1

            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters                     */

        String str = "aabccce";
        String result = ""; // a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // Each character from the string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;
        }
        System.out.println(result); // a2b1c3e1
    }
}
