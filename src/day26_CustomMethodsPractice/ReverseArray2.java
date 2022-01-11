package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length-1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

}
