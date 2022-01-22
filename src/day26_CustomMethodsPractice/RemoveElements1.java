package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        /*
    2. Create A class named RemoveElements:
	   2.1 Create A method that passes two parameters: an integer array and an integer index.
	       The method removes the element at the given index of the array and returns the new array.
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}
		2.2 Create A method that passes two parameters: A double array and an integer index.
		    The method removes the element at the given index of the array and returns the new array
		2.3 Create A method that passes two parameters: A char array and an integer index.
		    The method removes the element at the given index of the array and returns the new array
		2.4 Create A method that passes two parameters: A String array and an integer index.
		    The method removes the element at the given index of the array and returns the new array
        */

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1); // {100, 300, 400, 500, 600}

        numbers = removeElement(numbers, 1); // [100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));
    }


    // Removes the indexes from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length-1]; // 1,2

        int j = 0;
        for(int i = 0 ; i < array.length; i++){
            if(i == index){ // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


}
