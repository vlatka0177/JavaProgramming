package day22_MultiDimensionalArray;

public class ForEachLoop {

    public static void main(String[] args) {
    /*
        indexes of elements
              |
              |            0  1  2   0  1  2  3    0   1  2   3   4  index of elements */
        int[][] arr2D = { {1, 2, 3},{4, 5, 6, 7} , {8, 9, 10, 11, 12}};
        /* |                  0           1                2         index of arrays
           |
        indexes of 1D arrays

        For Each Loop
        - already iterated
        - iteration order is fixed
        - there must be a data structure

        for(DataType variable : Array){
        }

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }

        }                                                                           */

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


    }

}
