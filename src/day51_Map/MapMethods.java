package day51_Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

       // Student name & score:

        Map<String, Integer> students = new HashMap<>();
        students.put("Alison", 95);
        students.put("Marta", 95);
        students.put("Adam",95);
        students.put("Alex",96);
        students.put("Branimir",98);
        students.put("Suzy",97);
        students.put("Anita",98);

        students.put("Ana",85);
        students.put("Ana",86);
        students.put("Ana",87);

        System.out.println(students); // {Adam=95, Marta=95, Alex=96, Branimir=98, Ana=87, Suzy=97, Alison=95, Anita=98}
        System.out.println(students.size()); // 8


        // Display Alex's score:
        System.out.println(students.get("Alex")); // 96


        // Replace Ana's score with 90
        students.replace("Ana", 90 );
        System.out.println(students); // {Adam=95, Marta=95, Alex=96, Branimir=98, Ana=90, Suzy=97, Alison=95, Anita=98}

        students.remove("Alex");
        System.out.println(students); // {Adam=95, Marta=95, Branimir=98, Ana=90, Suzy=97, Alison=95, Anita=98}

        students.remove("Suzy");
        System.out.println(students); // {Adam=95, Marta=95, Branimir=98, Ana=90, Alison=95, Anita=98}

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Branimir");
        System.out.println(r1); // false
        System.out.println(r2); // true

        boolean r3 = students.containsValue(97);
        System.out.println(r3); // false

        System.out.println(students.isEmpty()); // false

        System.out.println("------------------------------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1); // map1 = {Adam=95, Marta=95, Branimir=98, Ana=90, Alison=95, Anita=98}
        System.out.println("map2 = " + map2); // map2 = {Adam=95, Marta=95, Branimir=98, Ana=90, Alison=95, Anita=98}

        System.out.println(map1 == map2); // false
        System.out.println(map1.equals(map2)); // true

        map1.clear();
        map2.clear();

        System.out.println(map1); // {}
        System.out.println(map2); // {}
    }
}
