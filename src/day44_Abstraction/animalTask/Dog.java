package day44_Abstraction.animalTask;

import day44_Abstraction.animalTask.Animal;

public class Dog extends Animal {

    // Generate constructor that calls parent class constructor
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    // Override the abstract methods of the parent class
    @Override
    public void eat() {
        System.out.println(getName() + " eats pizza.");
    }

    public void bark(){
        System.out.println(getName() + "is barking.");
    }
}
