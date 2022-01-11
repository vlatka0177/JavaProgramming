package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Marko", 'M',27,24494,'A');

        Student student2 = new Student();
        student2.setInfo("Sebastian", 'T',23,51098,'A');

        Student student3 = new Student();
        student3.setInfo("Ivan", 'M',29,1892,'A');

        Student student4 = new Student();
        student4.setInfo("Helena", 'F',46,27475,'A');

        Student student5 = new Student();
        student5.setInfo("Michael", 'M',62,13459,'B');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if (student.grade == 'A') {
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }

}

