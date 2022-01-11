package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        /*
        Remove functions:

        remove() removes one element. Must not be used in the loop.
        removeAll() removes multiple elements, if the elements to be removed are known.
        retainAll() retains multiple elements, if the elements to be removed are known.
        removeIf() removes  one or multiple elements under a condition, if the elements to be removed are known
        */


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        list.removeIf(p -> p < 5); // -> Lambda Expression

        System.out.println(list);

        System.out.println("----------------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3 , 4 ,5, 6, 7, 8, 9, 10));

        /* for (int i = 0; i < list2.size(); i++) {
            if(list2.get(i) %2 == 0 ){
                list2.remove(i);
            }
        }                                        */

        list2.removeIf(each -> each%2 == 0);

        System.out.println(list2);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J"));

        System.out.println(list3);

        System.out.println("----------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf( name -> !StringUtility.isPalindrome(name));

        System.out.println(names);
    }
}
