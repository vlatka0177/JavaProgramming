package AvengersPractice.day01;

public class StringExample3 {

    public static void main(String[] args) {

        // Create A new string that does not have the first and last char of the original string.

        String str = "Hello";
        String result = str.substring(1, str.length()-1);
        System.out.println(result);
    }
}
