package day44_Abstraction.animalTask;

public interface WildAnimal {

    /* Interface is not a class. It is a parent interface. (Parent to other classes)
       Only public access modifier can be used with interface.          */

    boolean isWild = true; // static and final by default

    void hunt(); // abstract method by default
                 // public by default, so there is no need to write it down

}
