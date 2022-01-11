package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Alan", "David", "Anthony", "Jimmy", "Daniel", "Aaron", "Anthony", "David", "Shay"));

        employees. retainAll(Arrays.asList("Anthony", "David"));

        System.out.println(employees);

        System.out.println("------------------------------------------------------");


        String[] names = {"Marko", "Matilda", "Miroslav", "Michael", "Sebastian", "Helena", "Ivan"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.charAt(0) == 'M');

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }
}
