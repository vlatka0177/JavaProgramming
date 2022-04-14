package InterviewQuestions;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 2, 0, 3, 0, 4, 0, 5};

        // int[] result = moveZerosToTheEnd(arr);
        // System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }
}
