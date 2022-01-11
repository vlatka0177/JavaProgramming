package AvengersPractice.day03_Loop;

public class CountWord_ForLoop {

    public static void main(String[] args) {

        /*
        Input: Java is Java
        Word to be counted: Java
        Output: 2
         */

        String sentence = "Java is Java";
        String word = "Java";
        int count = 0;

        /*
         Java is Java
         01234567891011  Space also has an index number
         Sentence length is 12.
         */
                            //            12 - 4 = 8
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String result = sentence.substring(i, i + word.length());
            if(result.equals(word))
                count++;
        }
        System.out.println("count = " + count);

    }
}
