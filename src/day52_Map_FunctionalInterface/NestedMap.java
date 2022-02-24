package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMap {

    public static void main(String[] args) {

        // Nested map uses a lot of memory and the code is difficult to read. Thus, it is not a preferred option.

        Map<Integer, String> map1 = new LinkedHashMap<>(); // EmployeeID and jobTitle
        
        Map<String, Integer> map2 = new LinkedHashMap<>();

        Map< Map<Integer, String>, Map<String, Integer> > mapOfMap = new LinkedHashMap<>();
        mapOfMap.put(map1, map2);

        for(Map.Entry<Map<Integer, String>, Map<String, Integer>> mapMapEntry : mapOfMap.entrySet()) {

        }
    }
}
