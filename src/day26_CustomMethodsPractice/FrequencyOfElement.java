package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        /*
        1. Create A class named FrequencyOfElement:

			1.1 Create A method that passes two parameters: an integer array and an integer element. The method
			returns the frequency of the given integer element from the integer array.

			1.2 Create A method that passes two parameters: A double array and A double element. The method
			returns the frequency of the given integer from the array.

			1.3 Create A method that passes two parameters: A char array and A char element. The method returns
			the frequency of the given char element from the char array.

			1.4 Create A method that passes two parameters: A String array and A String element. The method returns
			the frequency of the given String element from the String array.
        */

        int[] arr = {1, 1, 1, 11, 1, 2, 2, 3, 3, 3, 4, 4, 1, 1, 1, 1};

        int n = frequencyOfElement(arr, 1);

        System.out.println(n);

    }

    // Returns the frequency of the given element from the given array.
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }

}
