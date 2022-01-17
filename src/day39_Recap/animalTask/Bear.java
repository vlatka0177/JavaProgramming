package day39_Recap.animalTask;

public class Bear extends WildAnimal {

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

    public Bear(String breed, char gender, int age, String size, String color) { // Erase String name
        super("Bear", breed, gender, age, size, color); // Add "Bear" to name. Name field will not appear in Zoo.
    }

    // Override the hunt method
    public void hunt() {
        System.out.println(getName() + " is hunting a seal.");
    }

    //Add the hibernate method
    public void hibernate() {
        System.out.println(getName() + " is hibernating.");
    }
}
