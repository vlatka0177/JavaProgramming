package OfficeHours.day08;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> students;

    public Classroom(){
        students = new ArrayList<>();
    }
}

class Student {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.students.add(new Student()); // add new object
        classroom.students.add(new Student()); // add new object
        System.out.println(classroom.students.size()); // 2
    }
}
