package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Ana",95);
        students.put("Maria",90);
        students.put("Alan",85);
        students.put("Alex",80);
        students.put("Kristina",75);
        students.put("Robert",70);
        students.put("Andrew",98);

        /*  Set<String> keys = students.keySet();
            for (String eachKey : keys) {
            System.out.println(eachKey +" : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);
        }                                                         */

        System.out.println(students); // {Alex=80, Ana=95, Robert=70, Andrew=98, Alan=85, Maria=90, Kristina=75}

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds); // earlyBirds = {Ana=95, Andrew=98, Maria=90}
        System.out.println("angryBirds = " + angryBirds); // angryBirds = {Alex=80, Robert=70, Alan=85, Kristina=75}

        Set<String> names = students.keySet();

        System.out.println("--------------------------------------------------------");

        // Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>( students.values() );

        System.out.println(scores); // [80, 95, 70, 98, 85, 90, 75]

        for (Integer value : students.values()) {
            System.out.println(value); // 80 95 70 98 85 90 75
        }

        System.out.println("--------------------------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if(score > maxScore){
                maxScore = score;
            }

            if(score < minScore){
                minScore =score;
            }
        }

        System.out.println("maxScore = " + maxScore); // maxScore = 98
        System.out.println("minScore = " + minScore); // minScore = 70

        System.out.println("--------------------------------------------------------");

        int max = Collections.max( students.values() );
        int min = Collections.min( students.values() );

        System.out.println("max = " + max); // max = 98
        System.out.println("min = " + min); // min = 70

        System.out.println("--------------------------------------------------------");

        // How many students have the score of 95 or greater

        int count = 0;

        for (Integer eachScore : students.values()) {
            if(eachScore >= 95){
                count++;
            }
        }

        /*  for (String eachKey : students.keySet()) {
                Integer eachScore = students.get(eachKey);
                if(eachScore >= 95){
                    count++;
                }
             }                    */

        System.out.println(count); // 2

        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
            /* Alex : 80
               Ana : 95
               Robert : 70
               Andrew : 98
               Alan : 85
               Maria : 90
               Kristina : 75 */
        }
    }
}
