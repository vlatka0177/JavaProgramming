package day44_Abstraction.animalTask;

import day44_Abstraction.animalTask.Animal;

public final class Dog extends Animal implements Playable {

    /* Dog class can never be abstract because it has to be instantiated (create objects).
       Implements the interface playable

    Generate constructor that calls parent class constructor    */
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // Override the abstract methods of the parent class
    @Override
    public void eat() {

        System.out.println(getName() + " eats pizza.");
    }

    public void bark(){

        System.out.println(getName() + " is barking.");
    }

    // Overrides the abstract method of playable interface
    public void play(){
        System.out.println(getName() + " is playing with ball.");
    }
}
