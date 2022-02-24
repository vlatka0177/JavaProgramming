package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Daphne", "F");
        employeeMap.put("William", "M");
        employeeMap.put("Jeremy", "M");
        employeeMap.put("Gladys", "F");
        employeeMap.put("Donatella", "F");
        employeeMap.put("Keiko", "F");
        employeeMap.put("Bertrand", "M");
        employeeMap.put("Ana", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derek", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Stella", "F");
        employeeMap.put("Marika", "F");

        /*  1. Update the "M" to Male and "F" to Female

        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m") ){
                employeeMap.replace(key, "Male");
            }
            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }          */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("m") ){
                entry.setValue("Male");
                // employeeMap.replace(entry.getKey() , "Male");
            }

            if(entry.getValue().equalsIgnoreCase("f") ){
                entry.setValue("Female");
                // employeeMap.replace(entry.getKey() , "Female");
            }
        }
        System.out.println(employeeMap);
        /* {Keiko=Female, Gladys=Female, Donatella=Female, Bertrand=Male, Stella=Female, William=Male,
        Marika=Female, Jeremy=Male, Ana=Female, Orlando=Male, Brigitte=Female, Daphne=Female, Derek=Male}  */

        System.out.println("--------------------------------------");

        //  2. Display the names of all female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();

            if(eachValue.equals("Female")){
                System.out.println(eachKey);
                /*  Keiko
                    Gladys
                    Donatella
                    Stella
                    Marika
                    Ana
                    Brigitte
                    Daphne   */
            }
        }
    }
}
