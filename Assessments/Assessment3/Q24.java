package Assessments.Assessment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q24 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 97, 2, 56, 46, 73, 6, 2, 3, 7));

        String s = "";

        for(int i = 0; i < numbers.size(); i++) { // size of the array is 10

            if(i == 2 || i == 5 || i == 9) { // iteration == 2 or 5 or 9, iteration 0, 1, 3, 4, 6, 7, 8 go to if statement
                continue; // skip when iteration is 2 (2), 5 (73), 9 (7)
            }
            if(numbers.get(i) == 2 || numbers.get(i) % 3 == 0) { // if number at index i is 2 OR divisible by 3
                s += "1";                            // index 0 is 2, so we add 1
            } else {
                s += "0"; // 97
            }
        }
        System.out.println(s); // 1000111
    }
}
