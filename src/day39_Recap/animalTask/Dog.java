package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal {

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

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat() {
        System.out.println(getName() + " is eating steak.");
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}
