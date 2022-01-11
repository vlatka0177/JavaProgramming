package AvengersPractice.day03_Loop;

public class CountWord_WhileLoop {

    public static void main(String[] args) {

          /*
        Input: Java is Java
        Word to be counted: Java
        Output: 2
         */

        String sentence = "Java is Java";
        String word = "Java";
        int count = 0;

        while(sentence.contains(word)) {
            count++;
            sentence = sentence.replaceFirst(word, "");
        }
            System.out.println("count = " + count);

    }

}
