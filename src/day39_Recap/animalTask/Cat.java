package day39_Recap.animalTask;

import org.w3c.dom.ls.LSOutput;

public class Cat extends FriendlyAnimal {

    /*
    4. Create the following subclasses of FriendlyAnimal and override the eat method.

			1. Dog:
            Extra methods: bark()

			2. Cat:
            Extra methods: scratch(), meow()

			3. Dolphin:
            Extra methods: swim()

			4. Parrot:
            Extra methods:fly(), sing()
     */

    // Generate constructor
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    // Override the eat method
    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }
    //Add the scratch method
    public void scratch() {
        System.out.println(getName() + " is scratching.");
    }
    // Add the eat method
    public void meow() {
        System.out.println(getName() + " is meowing.");
    }

}
