package InterviewQuestions;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        int i = 0;
        int j = 0;
        for(i = numbers.length-1; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
            System.out.println(Arrays.toString(reversed));
    }
}
