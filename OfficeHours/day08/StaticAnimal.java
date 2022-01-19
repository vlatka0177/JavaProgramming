package OfficeHours.day08;

public class StaticAnimal {

    static String animal = "Dog"; // static

    static {
        animal = "cat";
    }

    public static void main(String[] args) {
        StaticAnimal st1 = new StaticAnimal();
        st1.animal = "rabbit";
        StaticAnimal st2 = new StaticAnimal();
        // Even when calling the new object, the last assigned value will be called.
        System.out.println(st1.animal.equals(st2.animal)); // true



    }
}
