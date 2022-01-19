package AvengersPractice.day04;

import java.util.ArrayList;

public class FindWordPositionInASentence_ArrayList {

    /*
    Find the position (number) of the given word in a sentence.
    Do not use indexOf() method                    */

    public static void main(String[] args) {

        //Word position     1   2  3   4    5     6 7  8   9
        String sentence = "Java is my job because I am an SDET";
        String word = "SDET";
        int position = findPosition(sentence, word);
        System.out.println(position); // 9
    }

    private static int findPosition(String sentence, String word) {
        ArrayList<String> words = splitWords(sentence);
        int i = 0;
        for (i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                break;
            }
        }
        return i + 1;
    }

    private static ArrayList<String> splitWords(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> result = new ArrayList<>();

        for(String word : words) {
            if (!word.isEmpty()) {
                result.add(word);
            }
        }
        return result;
    }
}
