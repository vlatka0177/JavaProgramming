package day46_Polymorphism;

public class PolymorphismIntro {

    public static void main(String[] args) {

        /*
        POLYMORPHISM (MANY FORMS)
        - ability of the objects to take on many forms
        - "is a relation" is necessary (inheritance)
        - reference type is a parent class/parent interface
        - object type is a child

        CALLING METHODS IN POLYMORPHISM
        - only the methods in reference type can be called
        - the called method calls an overridden version from a child class
        - if the method is not overridden, it will call parent/superclass version

        Animal animal1 = new Dog();
        animal1.bark(); // compile error

        Animal animal1 = new dog();

        INSTANCE OF KEYWORD
        - checks if the object is a certain class (returns boolean)

        POLYMORPHISM RULES
        - reference type can be a parent class or parent interface
        - reference type decides what can be accessed/called
        - object type decides which implementation to execute
        - reference name has to be meaningful and has to match with all the object types

        WebDriver driver = new FireFoxDriver();
        driver.takeScreenShot();

        Animal animal = new Tiger();

        TYPES OF CASTINGS

        1. PRIMITIVE TYPE CASTINGS
           - between primitives

           1.1. IMPLICIT PRIMITIVE TYPE CASTINGS
                - casting smaller primitive type into larger

           1.2. EXPLICIT PRIMITIVE TYPE CASTINGS

        REFERENCE TYPE CASTING
        - casting one reference type to another
        - there must be inheritance

        UPCASTING
        - casting the smaller reference type (subtype) to larger reference type (super type)
        - done implicitly

        DOWNCASTING
        - casting the larger reference type (super type) to smaller reference type (subtype)
        - done explicitly
            - cast operator is required to be given explicitly
        - allows access to the features of the objects type that are not in reference type

        alt +  -> automatically casts




         */

    }

}
