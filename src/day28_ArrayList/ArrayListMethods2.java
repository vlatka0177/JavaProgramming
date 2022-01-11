package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        /*
        remove(int index); removes the element at the given index
        remove(Object); removes the given object from ArrayList. Returns boolean.
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list); // [100, 200, 200, 200, 300, 400, 500]

        /*
        int num = 1;
        list.remove(num);
        */

         Integer num = 200;
         // list.remove(200);
         boolean r = list.remove(num);

         System.out.println(list); // [100, 200, 200, 300, 400, 500]
         System.out.println(r); // true

        //  clear() removes all elements

        list.clear();

        System.out.println(list.size()); // 0
        System.out.println(list); // []

        /*
        indexOf(Data); returns the index number of the first matching element, starting from the first element.
        Returns int.

        lastIndexOf(Data); returns the index number of the matching element, starting from the last element.

         */


        System.out.println("-----------------------------------------------------------------------");


        ArrayList<Character> characters = new ArrayList<>('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a); // 0
        System.out.println(b); // 4


        System.out.println("-----------------------------------------------------------------------");


        boolean r2 =  characters.contains('A');

        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2); // true
        System.out.println("r3 = " + r3); // false

        System.out.println("--------------------------------");

        // equals(ArrayList); returns true if two ArrayLists are equal (same elements in the same order)

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // false
        System.out.println(list1.equals(list2)); // true

        System.out.println("-----------------------------------------------------------------------");

        boolean r4 = list1.isEmpty();

        System.out.println("r4 = " + r4); // false

        System.out.println("------------------------------------------------------------------------");

        // addAll Method

        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1, 2, 3, 4, 5, 6, 7) );

        System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7]







    }
}
