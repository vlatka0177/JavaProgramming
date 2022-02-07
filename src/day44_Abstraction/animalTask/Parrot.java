package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable, Flying {

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

        System.out.println(getName() + " is eating seeds.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing.");
    }

    public void fly() {
            System.out.println(getName() + " is flying around the room.");
    }

    }

