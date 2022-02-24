package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println(set); // [1, 2, 3, 4, 5]

        // Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list); // [1, 2, 3, 4, 5]

        /* List<String> numbers = null; // NullPointerException
           System.out.println(numbers.size()); */

        System.out.println("------------------------------------------------------------------");

        // pop() -> last in, first out
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println("chars = " + chars); // [A, B, C, D]

        ((Stack)chars).pop();
        System.out.println("chars = " + chars); // [A, B, C]

        System.out.println("-------------------------------------------------------------------");

        // poll() -> first in, first out
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Michael", "Ivan", "Sebastian", "Marko", "Matilda"));
        System.out.println(names); // [Michael, Ivan, Sebastian, Marko, Matilda]

        ((LinkedList<String>) names).poll();
        System.out.println(names); // [Ivan, Sebastian, Marko, Matilda]

        ((LinkedList<String>) names).poll();
        System.out.println(names); // [Sebastian, Marko, Matilda]

    }
}
