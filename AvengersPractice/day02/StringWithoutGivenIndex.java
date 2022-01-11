package AvengersPractice.day02;

public class StringWithoutGivenIndex {

    public static void main(String[] args) {

        // Input: kitchen  Output: itchen

        String word = "kitchen";

        int index = 0;

        String result = word.substring(index+1);

        System.out.println("result = " + result);

    }
}
