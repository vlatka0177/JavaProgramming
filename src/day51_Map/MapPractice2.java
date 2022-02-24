package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

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

        //  1. and 2. Who has the maximum and minimum salary?
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                name1 = eachKey;
            }

            if (eachValue < minSalary) {
                minSalary = eachValue;
                name2 = eachKey;
            }
        }

        System.out.println(name1); // Jamison
        System.out.println(name2); // Conor

        System.out.println("----------------------------------------------");

        // 3. How many employees have the salary between 120k ~ 150K?

        int count = 0;

        for (Integer eachValue : map.values()) {
            if (eachValue >= 120000 && eachValue <= 150000) {
                count++;
            }
        }

        System.out.println(count); // 4

        System.out.println("----------------------------------------------");

        // 4. Display the names of the employees that are making less than 118k?

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 118000) {
                System.out.println(pair.getKey());
                /*  Anthony
                    Jimmy
                    James
                    Conor
                    Josh    */
            }
        }

        System.out.println("----------------------------------------------");

        // 5. Increase the salary employee by 10K if the current salary of employee is less than 120K

        System.out.println(map);
        /* {John=123000, Anthony=100000, Jimmy=115000, Jamison=145000, James=110000, Conor=85000, Josh=117000,
            Cory=118000, Anderson=125000, Steven=135000} */

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 120000) {
                entry.setValue(entry.getValue() + 10000);
            }
        }
        System.out.println(map);
        /* {John=123000, Anthony=110000, Jimmy=125000, Jamison=145000, James=120000, Conor=95000, Josh=127000,
           Cory=128000, Anderson=125000, Steven=135000}  */
    }
}
/*
1. Given the following map that contains the employee's names and their salary:
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
    1.1 Who has the maximum salary?
    1.2 Who has the minimum salary?
    1.3 How many employees has the salary between 120k ~ 150K?
    1.4 Display the names of the employees who are making less than 118k?
    1.5 Increase the salary of each employee by 10K
 */
