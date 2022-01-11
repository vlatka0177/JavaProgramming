package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // Store the elements: 10, 20, 50, 70

        int[] numbers = {10, 20, 50, 70};// Size: 4. Known elements: 10, 20, 50, 70.

        System.out.println(Arrays.toString(numbers)); // [10, 20, 50, 70]


        System.out.println("--------------------------------------------------");


        // Create a variable that can contain 5 scores

        int[] scores = new int[5]; // [0, 0, 0, 0, 0]
        scores[1] = 65;
        scores[scores.length -1]= 95; // last index
        scores[3] = 85;
        scores[0] = 55; // first index
        scores[2] = 75;

        System.out.println(Arrays.toString(scores)); // [55, 65, 75, 85, 95]

        System.out.println("----------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"}; // 0 ~ 11 (length - 1)
        /*
        System.out.println(months[0]); // January
        System.out.println(months[1]); // February
        System.out.println(months[2]); // March
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]); // December   */

        for(int i = 0; i < months.length; i++) {
            // i: represents the index numbers of the array, starting from index 0
            System.out.println(months[i]);
        }

        System.out.println("--------------------------------------------------------------");

        for(int i = months.length-1; i >= 0; i--) {
            // i: represents the index numbers of the array, starting from the last index.
            System.out.println(months[i]);
        }

    }
}
