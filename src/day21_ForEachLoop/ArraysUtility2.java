package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        /*
        5. copyOf(array, newLength)
        Copies from the first element of the array, to whatever is the chosen new length to copy.
        Returns new array.
        */

        String[] students = {"Eleonor", "Silvija", "Gordan", "Cinthia", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 4);

        System.out.println(Arrays.toString(earlyBirds)); // [Eleonor, Silvija, Gordan, Cinthia]

        /* If the newLength is longer than the number of elements, compiler will copy all the
        elements and then print null for numbers that exceed the elements of the array. */

        String[] earlyBirds2 = Arrays.copyOf(students, 10);
        System.out.println(Arrays.toString(earlyBirds2));
        // [Eleonor, Silvija, Gordan, Cinthia, David, James, Aaron, Daniel, null, null]

        System.out.println("----------------------------------------------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(numbers)); // {1, 2, 3, 4, 5}

        System.out.println("-----------------------------------------------------------------------");

        /*
        6. copyOfRange(array, beginningIndex, endingIndex)
        Copies the elements of the array, starting from the beginning index till the ending index
        (ending index excluded). Returns new array.                */

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6);
        System.out.println(Arrays.toString(ch2)); // [C, D, E, F]

        char[] ch3 = Arrays.copyOfRange(ch1, 2, 6+1);
        System.out.println(Arrays.toString(ch3)); // [C, D, E, F, G]

        System.out.println("---------------------------------------------------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //     index:    0   1   2   3   4   5   6   7   8   9

        int[] result = Arrays.copyOfRange(scores, 3, 8);
        System.out.println(Arrays.toString(result)); // [40, 50, 60, 70, 80]

        int[] result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(result2); // hashtag [I@3f0ee7cb

    }
}
