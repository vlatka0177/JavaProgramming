package Quizzes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQuiz {

    public static void main(String[] args) {

        /*
        QUESTION 1
        Valid declarations of ArrayList.      */

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<String>();

        /*
        ArrayList does not support primitives.
        Autoboxing converts A primitive into A wrapper class object.         */

        ArrayList<Double> list3 = new ArrayList<>();

        /* QUESTION 2

        ArrayList<int> list = new ArrayList<>();  // int is A primitive. ArrayList does not support primitives.
        list.add(10);

        System.out.println(list);  // Compile Error
        */

        // QUESTION 3

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);  // Index 0
        list4.add(2);  // Index 1
        list4.add(3);  // Index 2

        int a = 1;
        list4.remove(a);

        System.out.println(list4); // [1, 3]


        // QUESTION 4

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(1);  // Object 1
        list5.add(2);  // Object 2
        list5.add(3);  // Object 3

        Integer b = 1; // Object B = 1
        list4.remove(b);

        System.out.println(list5); // [2, 3]


        // QUESTION 5

        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");  // Index 0
        colors.add("red");  // Index 1
        colors.add("blue");  // Index 2
        colors.add("yellow");  // Index 3
        colors.add(3,"cyan");  // Cyan moves to index 3, and yellow shifts to index 4

        // ArrayList index shifts automatically with add method.

        System.out.println(colors);  // [green, red, blue, cyan, yellow]


        // QUESTION 6

        ArrayList<Integer> list6 = new ArrayList<>();
        Integer c = 1;  // There is nothing in the ArrayList
        System.out.println(list6.remove(c));  // false

        /* QUESTION 7
           ArrayList's size is dynamic. Array's size is fixed.
         */

        // QUESTION 8

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
            // Index              0, 1, 2, 3, 4

        list.set(0,list.get(4)); // Replace index 0 with index 4. [5, 2, 3, 4, 5]
        list.set(4, list.get(0)); // Replace index 4 with index 0. [5, 2, 3, 4, 5]

        System.out.println(list); // [5, 2, 3, 4, 5]


        // QUESTION 9

        ArrayList<Character> list7 = new ArrayList<>();
        for(char i = 'a'; i <='z'; i++) {
            list7.add(i);
        }
        boolean result = list7.containsAll(Arrays.asList('a', 'c', 'D')); // 'D' - case sensitive, A ~ z

        System.out.println(result); // false

       // QUESTION 10

       ArrayList<Integer> list8 = new ArrayList<>();
       list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

       for(Integer each : list){
           if(each % 2 !=0){  // 1 % 2 !=0 => skip, 2 % 2 = 0 => print and break (exit the loop)
               continue;
           }
           System.out.println(each + " "); // 2
           break;

        }













    }
}
