package day36_Inheritance.encapsulation;

import day36_Inheritance.encapsulation.Student;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Matilda",10,'F','A',"Veceslav Holjevac");
        student1.setAge(11);
        System.out.println(student1);

    }
}
