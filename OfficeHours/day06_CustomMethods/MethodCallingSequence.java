package OfficeHours.day06_CustomMethods;

public class MethodCallingSequence {

    public static void main(String[] args) {
        System.out.println("Not Deep"); // Prints first main()
        deep(); // Calling deep(), and going to deep()
        System.out.println("Not Deep"); // Prints fifth because finishes with main()
    }

    public static void deep() {
        System.out.println("Deep"); // Prints second
        deeper(); // Calling deeper(), and going to deeper()
        System.out.println("Deep"); // Prints fourth because going back one step above first
    }

    public static void deeper() {
        System.out.println("Deeper"); // Prints third
    }
}
