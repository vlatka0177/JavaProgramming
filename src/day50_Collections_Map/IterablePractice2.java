package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Cameron", "cameron", "cAmErOn", "Ivan", "Sebastian", "Marko", "Matilda",
                "Helena", "Cameron", "Valerija"));

        // Remove all the names Cameron.

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("cameron")){
                it.remove();
            }
        }

        System.out.println(names); // [Ivan, Sebastian, Marko, Matilda, Helena, Valerija]

        System.out.println("-------------------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Cameron", "cameron", "cAmErOn", "Ivan", "Sebastian", "Marko", "Matilda",
                "Helena", "Cameron", "Valerija"));

        for(Iterator<String> i=names2.iterator(); i.hasNext() ;  ){
            if(i.next().equalsIgnoreCase("cameron")){
                i.remove();
            }
        }

        System.out.println(names2); // [Ivan, Sebastian, Marko, Matilda, Helena, Valerija]

        System.out.println("--------------------------------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Cameron", "cameron", "cAmErOn", "Ivan", "Sebastian", "Marko", "Matilda",
                "Helena", "Cameron", "Valerija"));


        names3.removeIf(each -> each.equalsIgnoreCase("cameron") );

        System.out.println(names3); // [Ivan, Sebastian, Marko, Matilda, Helena, Valerija]

        System.out.println("----------------------------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100, 90, 89, 79, 50));

        Iterator<Integer> q = set.iterator();

        while(q.hasNext()){
            if(q.next() %2 ==0){
                q.remove();
            }
        }

        System.out.println(set); // [1, 3, 5, 7, 9, 79, 89]
    }
}
