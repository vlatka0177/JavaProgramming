package day39_Recap.animalTask;

public class Lion extends WildAnimal {

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

    public Lion(String breed, char gender, int age, String size, String color) {
        super("Lion", breed, gender, age, size, color);
    }

    // Override the hunt method
    public void hunt() {
        System.out.println(getName() + " is hunting A nyala.");
    }

    //Add the roar method
    public void roar() {
        System.out.println(getName() + " is roaring.");
    }
}
