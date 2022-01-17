package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal {

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

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " is eating seeds.");
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public void sing() {
        System.out.println(getName() + "is singing");
    }
}
