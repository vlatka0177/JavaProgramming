package Assessments.Assessment2_day04OfficeHours;

import java.util.Arrays;

public class Q27 {

    public static void main(String[] args) {

        String [] words = {"one", "two", "three", "four"};
        String [] other = new String[words.length];
        int index = 0;

        for (String word : words) {
            other[index++] = word + word.length();
            /*     0         one  +     3
                   1         two  +     3
                   2        three +     5
                   3         four +     4                */
        }

        System.out.println(Arrays.toString(other));  // [one3, two3, three5, four4]

    }
}
