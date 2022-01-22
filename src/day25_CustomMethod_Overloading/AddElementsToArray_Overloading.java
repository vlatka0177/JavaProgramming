package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        numbers = addElement(numbers, 7);

        char[] chars = {'A', 'B', 'C', 'D'};

        chars = addElement(chars, 'E');

        String[] names = {"Leonardo", "Mirna", "Robert", "Helena" };

        names = addElement(names, "Milvia");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }

    // 1. Create A return method called addInteger that can add an Integer after the  last index of an integer array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array){
            result[i++] = each;
        }
        result[i] = element; // Element needs to be assigned to the last index

        return result;
    }


    // 2. Create A return method called addDouble that can add A double after the last index of A double array
    public static double[] addElement(double[] array, double element){

        double[] result = new double[array.length + 1];

        int i = 0;

        for(double each : array){
            result[i++] = each;
        }
        result[i] = element;
        // result[result.length-1] = element;

        return result;
    }


    // 3. create A return method called addString that can add A String after the last index of A String array
    public static String[] addElement(String[] array, String element){

        String[] result = new String[array.length + 1];

        int i =0;

        for (String each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


    //4. create A return method called addChar that can add A char after last index of A char array
    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length + 1];

        int i =0;

        for (char each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


}
