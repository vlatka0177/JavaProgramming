package Assessments.Assessment2_day04OfficeHours;

public class Q16 {

    public static void main(String[] args) {

        String s2 = "I will find the lost book";
        String word2 = ""; // An empty string.
        /*
        for(int index = s2.length()-1; index <= 0;  // Does not execute the for loop
            word2 += s2.charAt(index);
        }
        System.out.println(word2); // No answer text provided. Empty string.
        */

        //To go into the for loop
        for(int index = s2.length()-1; index <= 0; index--) {
            word2 += s2.charAt(index);
        }
        System.out.println(word2); // koob tsol eht dnif lliw I

    }
}
