package AvengersPractice.day04;

public class FindWordPositionInASentence {

    /*
    Find the position (number) of the given word in a sentence.
    Do not use indexOf() method                    */

    public static void main(String[] args) {
        //Word position     1   2  3   4    5     6 7  8   9
        String sentence = "Java is my job because I am an SDET";
        String word = "SDET";
        int position = findWordPositionInASentence(sentence, word);
        System.out.println(position); // 9
    }

    private static int findWordPositionInASentence(String sentence, String word) {
        String[] words = sentence.split(" ");
        int count = 0;

        for (String each : words) {
            count++;
            if(each.equals(word)) {
                break;
            }
        }
        return count;
    }
}
