package day44_Abstraction.animalTask;

public final class Tiger extends Animal implements WildAnimal {

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating deer");
    }

    /*  Access modifier must always be public because the access modifier has to be the same or more visible
        than the parent access modifier.
        A parent interface always has public access modifier          */
    public void hunt() {
        System.out.println(getName() + " is hunting antelope.");
    }
}
