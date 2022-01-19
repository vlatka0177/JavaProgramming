package OfficeHours.day08;

public class StaticExample {

    static void method1(){
        System.out.print(3);
        // Methods only run when called. Here, method was not called.
    }

    public static void main(String[] args) {
        System.out.print(5); // Prints 5 second = result is 75
        // method1(); //  If method() were called, the result would be 753
    }

    static {
        System.out.print(7); // Prints 7 first
        // Static block runs first: 7. Then main method is run: 5
    }
}
