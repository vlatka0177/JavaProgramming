package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon","Wooden Spoon", "Wooden Spoon",
                "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels" };

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1); // [Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        arr = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); // [Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); // [Paper towels, Wooden Spoon, Coke, Book, Phone, Pen, Eggs, Milk]

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr)); // [Paper towels, Wooden Spoon, Coke, Book, Phone, Pen, Eggs, Milk]

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list); // [1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]

        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s =new ArrayList<>( Arrays.asList(array) );

        s.addAll(Arrays.asList("E", "F", "G" ));

        System.out.println(s); // [A, A, B, C, E, F, G]

        System.out.println("-----------------------------------------------");

        /* Given:
           Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
           Return the fifth element after removing the duplicates
           Do not change the order of the elements                      */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums)); // []

        System.out.println("-----------------------------------------------");

        String str = "aaaabbbbccccdddeeeee";

        String result = ""; // a4b4c4d3e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }
        System.out.println(result); // a4b4c4d3e5

        System.out.println("------------------------------------------------");
    }
}
