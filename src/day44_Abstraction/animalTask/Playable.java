package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static and final variable by default (static members only accept static members)

    public static void method1(){ // verifies that the variable is static
        System.out.println(isFriendly);
    }

    void play(); // abstract by default

    // Dog, cat, and parrot share the playable interface
}
