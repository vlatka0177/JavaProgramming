package day39_Recap.animalTask;

public class Crocodile extends WildAnimal {

    /*
    5. Create the following subclasses of WildAnimal and override the hunt method.
       Add any extra methods that are needed:

            1. Lion
			2. Tiger
			3. Eagle
			4. Bear
			5. Python
			6. Crocodile
	 */

    public Crocodile(String breed, char gender, int age, String size, String color) {
        super("Crocodile", breed, gender, age, size, color);
    }

    // Override the hunt method
    public void hunt() {
        System.out.println(getName() + " is hunting a wildebeest.");
    }

    //Add the ambush method
    public void ambush() {
        System.out.println(getName() + " is ambushing.");
    }

    public void grab() {
        System.out.println(getName() + " is grabbing");
    }
}
