package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        /*

        Arrays
        - size is fixed
        - supports primitives and non-primitives
        - single dimensional and multidimensional arrays

        1. Single Dimensional Array
        - container for the elements

        int[] array = {10, 20, 30};

        2. Multi Dimensional Array
        - container for the arrays (array of arrays)
        - the number of the dimensions could be from 2 to n (infinite)
        - N dimensional array contains N-1 dimensional array

        int[][] array2D = new int[3][];
         |                        |
        data type     number of one dimensional arrays

        Index Numbers

        indexes of elements
              |
              |            0  1  2   0  1  2  3    0   1  2   3   4  index of elements
        int[][] arr2D = { {1, 2, 3},{4, 5, 6, 7} , {8, 9, 10, 11, 12}};
           |                  0           1                2         index of arrays
           |
        indexes of 1D arrays

        [index of arrays] [index of elements]
        */

        String[] group1 = {"Jon", "Joe", "James"};
        String[] group2 = {"Jon", "Joe", "James"};
        String[] group3 = {"Jon", "Joe", "James"};


        String[][] groups = new String[3][]; /* number of arrays is specified in the first bracket
                                                index: 0, 1, 2   */
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

       // System.out.println(Arrays.toString(groups)); toString() is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------------------------------------");

        /*
        {1, 2, 3}
        {4, 5, 6, 7}
        {8, 9, 10, 11, 12}

        indexes of elements
              |            0  1  2   0  1  2  3    0   1  2   3   4  index of elements */
        int[][] arr2D = { {1, 2, 3},{4, 5, 6, 7} , {8, 9, 10, 11, 12}};
        /* |                  0           1                2         index of arrays
        indexes of 1D arrays                                                           */

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]
                                                        // multi dimensional array

        System.out.println(Arrays.toString(arr2D[1])); // {4, 5, 6, 7} single dimensional array

        System.out.println(arr2D[2][3]); // 11, element

    }
}
