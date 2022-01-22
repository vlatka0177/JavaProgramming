package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        /*
     Task2:
     1. Create A return method called addInteger that can add an Integer after the  last index of an integer array

     2. Create A return method called addDouble that can add A double after the last index of A double array

     3. Create A return method called addString that can add A String after the last index of A String array

     4. Create A return method called addChar that can add A char after last index of A char array
      */


        int[] arr = {1,2,3,4,};

        arr = addInteger(arr,5);

        System.out.println(Arrays.toString(arr)); // {1, 2, 3, 4, 5}

        System.out.println("--------------------------------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        arr2 = addDouble(arr2, 5.5);

        System.out.println(Arrays.toString(arr2)); // {1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println("---------------------------------------------------------------");

        String[] names = {"Sonja", "Ladislav", "Maja", "Branimir"};

        names = addString(names, "Leila");

        names = addString(names, "Igor");

        System.out.println(Arrays.toString(names)); // [Sonja, Ladislav, Maja, Branimir, Leila, Igor]

        System.out.println("-----------------------------------------------------------------");

        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addChar(chars, 'E');

        System.out.println(Arrays.toString(chars)); //{'A', 'B', 'C', 'D', 'E'}

    }

    // 1. Create A return method called addInteger that can add an Integer after the  last index of an integer array
    public static int[] addInteger(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array){
            result[i++] = each;
        }
        result[i] = element; // Element needs to be assigned to the last index

        return result;
    }


    // 2. Create A return method called addDouble that can add A double after the last index of A double array
    public static double[] addDouble(double[] array, double element){

        double[] result = new double[array.length + 1];

        int i = 0;

        for(double each : array){
            result[i++] = each;
        }

        result[i] = element;
        // result[result.length-1] = element;

        return result;
    }


    /* Copy, paste, and highlight the box to be replaced. Command + r. Top left pop up box: element to be replaced,
     underneath box: element that replaces, press Replace All, exit x top right */

    // 3. create A return method called addString that can add A String after the last index of A String array
       public static String[] addString(String[] array, String element){

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
    public static char[] addChar(char[] array, char element){

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

