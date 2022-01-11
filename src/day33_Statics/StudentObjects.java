package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Milvia");
        System.out.println(student1);

        Student student2 = new Student("Robert", 'M');
        System.out.println(student2);

        Student student3 = new Student("Jasmina", 11);
        System.out.println(student3);

        Student student4 = new Student("Tomislav", 22, 'A');
        System.out.println(student4);

        Student student5 = new Student("Vesna", 'F', 33);
        System.out.println(student5);

        Student student6 = new Student("Milan",'M', 38, 74);
        System.out.println(student6);

        Student student7 = new Student("Mario",'M',52,87,'A');
        System.out.println(student7);

        System.out.println(student1 == student2); // false

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.toString(students) );

    }
}
