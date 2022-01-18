package AvengersPractice.day02;

public class WordWithoutX {

    public static void main(String[] args) {

        // Remove x only if at the beginning or at the end of a string. Otherwise, leave unchanged.

        String word = "XHiX";

        // For Loop Solution

        String result = "";

        for (int i = 1; i < word.length()-1; i++) {
            result += word.charAt(i);
        }

        System.out.println("result = " + result);

        System.out.println("------------------------------------------");

        // Substring Solution

        String result2= "";

        result2 = word.substring(1,word.length()-1);

        System.out.println("result2 = " + result2);

    }

}
