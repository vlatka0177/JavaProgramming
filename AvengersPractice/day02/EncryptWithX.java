package AvengersPractice.day02;

public class EncryptWithX {

    public static void main(String[] args) {

        // Input: cydeo   Output: cxyxdxexox

        String word = "cydeo";

        char ch = 'x';

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            result += "" + word.charAt(i) + ch; // Without '' runs result as numbers
        }
        System.out.println("result = " + result);

    }
}
