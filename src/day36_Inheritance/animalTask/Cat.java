package day36_Inheritance.animalTask;

public class Cat extends Animal { // Cat is an Animal. Child inherits everything visible from the Parent.

    public void meow() {
        System.out.println(name = "is meowing");
    }

    public void scratch() {
        System.out.println(name = "is scratching");
    }

    /*
    Cat now has
    - 6 variables from the Parent Class
    - 6 methods from the Parent Class + 2 own methods                           */
}
