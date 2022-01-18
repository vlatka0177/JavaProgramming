package AvengersPractice.day01;

public class StringExample2 {

    public static void main(String[] args) {

        // Create a new string made of the three copies of the last 2 chars in the original string.

        // index      01234
        String str = "Cydeo";  // String length: 5

        int lastCharIndex = str.length()-1;
        int secondToLastCharIndex = str.length()-2;

        String result = "" + str.charAt(secondToLastCharIndex) + str.charAt(lastCharIndex);

        System.out.println("result = " + result.repeat(3));;

        System.out.println("-----------------------------------------------------");

        String result2 = str.substring(secondToLastCharIndex);

        System.out.println("result2 = " + result2.repeat(3));





    }
}
