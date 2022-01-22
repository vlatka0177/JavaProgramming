package day27_WrapperClasses;


import java.util.Arrays;

public class ReplaceAll {

    public static void main(String[] args) {

        /*
        2. Replace All Task:
        2.1 Create A method named ReplaceAll that passes three parameters: integer array, integer oldElement,
        and integer newElement. The method replaces the value of old elements of the array with the given
        value of the new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
         */
        
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        //            0   1   2   3   4   5   6   7

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr)); // [10, 10, 20, 300, 40, 300, 300, 300]

        arr = replaceAll(arr, 300, 500);

        System.out.println(Arrays.toString(arr)); // [10, 10, 20, 500, 40, 500, 500, 500]

    }

    // Replaces all the matching old values of the array with the new value.
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
    
    for (int i = 0; i < array.length; i++){
        
        if(array[i] == oldValue){
            array[i] = newValue;
        }
    }
    return array;
    }

    
    // Replaces all the matching old values of the array with the new value.
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++){

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }


    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++){

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }


    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++){

            if(array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }


}
