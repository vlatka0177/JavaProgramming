package day36_Inheritance.animalTask;

public class Lion extends Animal { // Lion is an Animal

    public void hunt() {
        System.out.println(name + " is hunting");
    }

    public void roar() {
        System.out.println(name + " is roaring");
    }

    /*
    Lion now has
    - 6 variables from the Parent Class
    - 6 methods from the Parent Class + 2 own methods                           */
}
