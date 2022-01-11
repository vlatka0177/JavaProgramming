package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        /*
        1.  to.String()
            Converts the array object (single dimensional) to string. Returns string.
        */

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);// hashcode
        System.out.println(Arrays.toString(nums)); // String object "{1,2,3,4,5}"
        System.out.println(nums[0]); // 1

        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());

        To print any single dimensional array, the method from the Arrays Utility must be called.
        It cannot be called implicitly.

        2. deepToString()
           Converts the array object (multidimensional) to string. Returns string.                  */

        System.out.println("------------------------------------------------------------------");

        /*
        3. sort()
           Sorts the array in ascending order (smallest to largest).                   */

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores)); // {55, 65, 78, 85, 95, 100}

        System.out.println("Min Score = " + scores[0]); // Min Score = 55
        System.out.println("Max Score = " + scores[scores.length-1]); // Max Score = 100

        System.out.println("--------------------------------------------------------");

        String[] names = {"Goran", "Ana", "Zrinka", "Adam", "Maria", "Suzana"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names)); // [Adam, Ana, Goran, Maria, Suzana, Zrinka]

        System.out.println("----------------------------------------------------------");

        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words)); // [ANNA, Anna]
        /* Upper case has the lower number on ASCII Table than the lower case, so upper case "ANNA" is printed
        first when sorted in ascending order. */

        System.out.println("------------------------------------------------------------------");

        /*
        4. equals(array1, array2)
           Checks if two arrays are equal. Returns boolean.                   */

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1); // false

        Arrays.sort(arr1); // {1,2,3}
        Arrays.sort(arr2); // {1,2,3}

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2); // true

        System.out.println("------------------------------------------------------------------");

        /*
        Anagram:
        listen    silent
        heart     earth
        */

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram); // anagram = true

    }

}

