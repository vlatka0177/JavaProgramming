package Assessments.Assessment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q25 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList
                ("during", "storm", "rain", "fell", "season", "cloudy", "safe"));

                        ArrayList<Integer> lengths = new ArrayList<>();

                for(String word : words) {
                    lengths.add(word.length()); // because it is string, it is method
                    // lengths.add(word.length); Compile error. Cannot resolve symbol 'length'
                }
        System.out.println(lengths); // [6, 5, 4, 4, 6, 6, 4]
    }
}
