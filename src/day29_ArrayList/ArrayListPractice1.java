package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        /*
        1. Create an Array of string called countries
        2. Write a program that can remove all the country names that have length of 10 or greater
        */

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        // Converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p -> p.length() >= 10);

        // Converting arrayList to array
        countries = list.toArray(new String[0]);
        // Temporary value that will be replaced with the size of array becomes known
        System.out.println(Arrays.toString(countries));

    }
}
