package day36_Inheritance.animalTask;

public class Dog extends Animal { /* Inherit, rather than import Animal class
         Child Class   Parent Class

  Import:
        - borrows
        - allows for the variables and methods from another class to be used
  Extends:
        - owns

  Dog Child Class inherits from Animal Parent Class:
    - 6 variables
    - 6 methods
   */

    public void bark() {
        System.out.println(name + " is barking");
    }
}
