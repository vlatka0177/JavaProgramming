package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


       // 1. add() Method

        // Adds an element

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Index 0
        numbers.add(20); // Index 1  Size of ArrayList is adjusted automatically as more numbers are added.
        numbers.add(30); // Index 2
        numbers.add(40); // Index 3
        numbers.add(50); // Index 4

        System.out.println(numbers); // [10, 20, 30, 40, 50]

        // Inserts an element to A specific index

        numbers.add(2,25); // Inserts 25 at index 2. Other indexes are shifted.
        numbers.add(5,45);

        System.out.println(numbers); // [10, 20, 25, 30, 40, 45, 50]


        // 2. lastIndexOf()

        System.out.println(numbers.size()); // 7
        
        int lastIndex = numbers.size() - 1;
        
        System.out.println("lastIndex = " + lastIndex); // 6


        // 3. get(index) Method
        
        int num = numbers.get(3); // unboxing

        System.out.println("num = " + num);

        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------------------------------------------");

        // set(index, data);

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "Java Script"); // Replace
        list.set(3, "C#");

        System.out.println(list);

        System.out.println("------------------------------------------------------------------------");

        // remove(int, index);

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Marta");
        employees.add("Tihomir");
        employees.add("Matilda");
        employees.add("Robert");
        employees.add("Sanja");
        employees.add("Mislav");
        employees.add("Kornelia");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove( employees.size() -1 );

        System.out.println(employees);

    }

}
