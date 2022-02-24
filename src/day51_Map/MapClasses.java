package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        /*             key    value
        Map<Double, Boolean> hashMap = new HashMap<>();
        hashMap.put(2.5, true); */

         //   key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Matilda");
        hashMap.put(20, "Ivan");
        hashMap.put(3, "Sebastian");
        hashMap.put(40, "Helena");

        hashMap.put(5, "Isabella");
        hashMap.put(5, "Marko");

        hashMap.put(6, "Marko");
        hashMap.put(7, "Marko");
        hashMap.put(8, "Marko");

        hashMap.put(null, "Tamara");
        hashMap.put(null, "Linda");
        hashMap.put(null, null);
        hashMap.put(71, null);
        hashMap.put(62, null);

        System.out.println("hashMap = " + hashMap);
        /* hashMap = {null=null, 3=Sebastian, 20=Ivan, 5=Marko, 6=Marko, 7=Marko, 71=null, 40=Helena, 8=Marko,
                      10=Matilda, 62=null}

        System.out.println(hashMap.get());

        Key has to be unique.
        - When keys are duplicated hashMap accepts the last inserted duplicated pair, and the others are removed.

        Value can be duplicated.

        Maintains the random order.

        Accepts null value. */

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Matilda");
        linkedHashMap.put(20, "Ivan");
        linkedHashMap.put(3, "Sebastian");
        linkedHashMap.put(40, "Helena");
        linkedHashMap.put(5, "Marko");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Tamara");

        System.out.println("linkedHashMap = " + linkedHashMap);
        // linkedHashMap = {10=Matilda, 20=Ivan, 3=Sebastian, 40=Helena, 5=Isabella, null=Tamara}

        Map<Integer, String> treeMap = new TreeMap<>(); // Key cannot be null. Value can be null and duplicated.
        treeMap.put(10, "Matilda");
        treeMap.put(20, "Ivan");
        treeMap.put(3, "Sebastian");
        treeMap.put(40, "Helena");
        treeMap.put(5, "Isabella");
        treeMap.put(5, "Marko");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap);
        // treeMap = {3=Sebastian, 5=Marko, 7=null, 10=Matilda, 20=Ivan, 40=Helena}

        Map<Integer, String> hashtable = new Hashtable<>(); // Key and value cannot be null.
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
       // hashtable.put(6, null); NullPointerException

        System.out.println("hashtable = " + hashtable);
        // hashtable = {10=Arthur, 20=George, 40=Emma, 5=Isabella, 3=Jack}

        /*   String str = null;
             System.out.println(str.toUpperCase()); */

    }
}
