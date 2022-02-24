package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Anthony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jamison", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        /* Displays the names of all employees that have the maximum salaries

        int maxSalary = Integer.MIN_VALUE;

        for ( Integer eachValue : map.values() ) {
            if(eachValue > maxSalary){
                maxSalary = eachValue;
            }
        }  */

        int maxSalary = Collections.max( map.values() );

        System.out.println("maxSalary = " + maxSalary); // maxSalary = 145000

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println(pair.getKey()); // Jamison
            }
        }
    }
}
