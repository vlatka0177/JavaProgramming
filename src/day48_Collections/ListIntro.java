package day48_Collections;

import java.sql.Array;
import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();           // fastest for accessing elements
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list1.get(0));

        List<Integer> list2 = new LinkedList<>();           // fastest for deleting and inserting elements
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list3.get(0));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list4.get(0));

    }


}
