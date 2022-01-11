package day31_Constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ana", 37, 'F','A', 738);
        Student student2 = new Student("Marko", 27, 'M', 'A',456);

        System.out.println(student1);
        System.out.println(student2);
    }
}
