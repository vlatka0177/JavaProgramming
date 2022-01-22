package InterviewQuestions;

public class StringReverse {

    public static void main(String[] args) {

        String str = "level"; // variable
        String result = " ";

        for(int i = str.length()-1; i >= 0; i--) {
            /*initialization; condition; iteration
              i is index number of str, here starting from the last index to index 0.
              length() method counts the number of characters, starting with 1.
             */

            result += str.charAt(i); // Concatenation: adds each character to result.
        }
            System.out.println(result.equalsIgnoreCase(str));
    }

}
