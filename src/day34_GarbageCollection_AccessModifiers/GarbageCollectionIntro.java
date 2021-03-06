package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollectionIntro {

    public static void main(String[] args) {

        /*

        JVM periodically runs Garbage Collector process to remove unreferenced objects from Java Heap.
        Calls finalize() method to destroy these objects.

        Unreferencing an object

        1. Null keyword (By nulling the reference)
           - A special value (not an object)

           dog d = new Dog();
           d = null; // No object has been created.

           // int n = null;
           String str = null // No object has been created from this String.
           String str = " "; // Object of A string. An empty class.
           */

        String str = "Wooden Spoon"; // In green color
        str = null; // Changes "Wooden Spoon" to grey. No longer referenced.
        System.out.println(str); // null

        Car car1 = new Car("Toyota");
        car1 = null; // Changes the color to grey. Eligible for garbage collection.
        System.out.println(car1); // null

        System.out.println("---------------------------------------------------");

        // 2. Creating A new object (By assigning A reference to another)

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        // One reference name referenced to only one object.

        System.out.println(dog1); // Dog{name=' Max', breed='null', age=0, gender= , size='null', color='null'}

        System.out.println("------------------------------------------------");

        String language = "Python";
        language = "Java";

        System.out.println(language); // Java

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1); // [100, 200, 300, 400]
        System.out.println(list2); // [100, 200, 300, 400]
        System.out.println(list1 == list2); // true

        System.out.println("-------------------------------------------------");

        Student student1 = new Student("Tihomir", 30, 'M', 'B', 459);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Alan";

        System.out.println("Student 1 = " + student1);
        // Student 1 = Student{name='Alan', age=30, gender=M, grade=A, id=459}
        System.out.println("Student 2 = " + student2);
        // Student 2 = Student{name='Alan', age=30, gender=M, grade=A, id=459}

        System.out.println("---------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1); // 1 = [Java, Python]
        System.out.println("l2 = " + l2); // l2 = [Java, Python]

    }
}
