package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        /*
        Array
        - Size is fixed
        - Supports primitives and non-primitives

        Collection
        - Size is dynamic
        - Does not support primitives

        ArrayList
        - A class in a Collection
        - Presented in "java.util" package. import java.util.ArrayList;
        - Stores objects
        - Elements have index numbers
        - Size is automatically adjusted. Add and remove functions.
        - Does not support primitives

        Declaring an ArrayList

        ArrayList<DataType> name = new ArrayList<DataType>();
                        |                                 |
                     Mandatory                         Optional

         Array v ArrayList
            - Both have index numbers

         Array

         ArrayList
         */

        ArrayList<Integer> numbers = new ArrayList <Integer>();
        // Only integer objects can be stored in this ArrayList

        ArrayList <String> names = new ArrayList <>(); // Not necessary to declare objects in new ArrayList

        System.out.println(numbers); // No need to call toString Method
        System.out.println(names);

        /*
        ArrayList Methods

        add()
        set()
        indexOf()
        equals()
        addAll()
        size()
        remove()
        lastIndexOf()
        isEmpty()
        removeAll()
        get()
        clear()
        contains()
        containsAll()
        retainAll()

        add(Data) adds the data after the last index of the ArrayList

        add(index, Data)

         */
    }
}
