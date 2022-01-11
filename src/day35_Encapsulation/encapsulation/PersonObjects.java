package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("Ivan");
        p1.setAge(29);

        System.out.println(p1.getName() + ": " + p1. getAge()); // Ivan: 29
    }

}
