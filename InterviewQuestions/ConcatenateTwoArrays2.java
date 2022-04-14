package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateTwoArrays2 {

    public static void main(String[] args) {
        Integer[] first = {1, 2, 3, 4, 5};
        char[] second = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString((Object[]) concatTwoArrays(first, second)));
    }

    public static Object concatTwoArrays(Integer[] numbers, char[] chars) {

        Object[] concatResult = new Object[numbers.length + chars.length];

        int i = 0;
        for (int each : numbers) {
            concatResult[i++] = each;
        }
        for (char each2 : chars) {
            concatResult[i++] = each2;
        }
        return concatResult;
    }
}
