package Assessments.Assessment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q27 {

    public static void main(String[] args) {

        String [] cities = {"Boston", "Houston", "Austin", "Lincoln", "Tulsa"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));

        int a = list.size();

        for(String str : list) { // Boston, takes each element

            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) { // Boston reverses Houston reverses Austin reverses
                rev += str.charAt(i);     // reverse Boston and Houston back
            }
            list.set(--a, rev); // notsoB at index 4, notsugH at index 3, nitsuA at index 2 Houston at 1 and Boston at 0
        }   /* The set method is changing the specific index of elements, changing the string list,
               and setting the new version of the list.   */
        System.out.println(list); // [Boston, Houston, nitsuA, notsuoH, notsoB]

        /*
        [Boston, Houston, Austin, Lincoln, Tulsa]
        [Boston, Houston, Austin, Lincoln, notsoB]
        [Boston, Houston, Austin, notsuoH, notsoB]
        [Boston, Houston, nitsuA, notsuoH, notsoB]
        [Boston, Houston, nitsuA, notsuoH, notsoB]
        [Boston, Houston, nitsuA, notsuoH, notsoB]
        [Boston, Houston, nitsuA, notsuoH, notsoB]
        */
    }
}
