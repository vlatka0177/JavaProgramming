package day44_Abstraction.animalTask;

import day44_Abstraction.animalTask.Animal;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
    }
}
