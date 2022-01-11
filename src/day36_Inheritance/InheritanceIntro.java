package day36_Inheritance;

public class InheritanceIntro {

    /*
    INHERITANCE (Is A Relation)

    - Used for creating an "is a" relationship among the classes (parent and child, super and sub)
    - When an "is-a" relationship exists between objects, it means that the specialized object has all the
      characteristics of the general object


                                       INHERITANCE
                                         Mammal
                All mammals have common characteristics: name, number of legs, weight, eat, drink

          CUSTOM CLASS                CUSTOM CLASS                        CUSTOM CLASS
          Dog                             Cat                                  Cow
          legs                            legs                                 legs



       CHILD/SUB CLASS AND PARENT/SUPER CLASS
       - The keyword used for inheritance is extends.

                Child/Sub Class  Parent/Super Class
                        |             |
          public class Dog extends Animal {

       Parent/Super Class
            - the class whose features are inherited

       - Child/Sub Class
            - the class that inherits visible features (variables and methods) of the other class, Parent/Super class
            - can add its own fields and methods in addition to the Parent/Super Class fields and methods
            - cannot inherit from another Child/Sub class

        INHERITED TO SUB CLASS
        - All accessible variables and methods (depending on the access modifier)

        NOT INHERITED TO SUB CLASS
        - Private variableS and methods
        - Constructors, but child class MUST call one of the parent's class constructors, as long as it is visible

        Child/Sub Class extends Parent/Super Class

        Mammal
        name, breed, gender, size, age, color
        setInfo(), eat(), drink(), move(), sleep(), toString()

        Dog extends Mammal:
        bark()

        Cat extends Mammal:
        meow()

        Cow extends Mammal:
        moo()

        Lion extends Mammal:
        roar()

        ADVANTAGES
        - less code
        - improves re-usability
        - less memory usage
        - easy to maintain
        - clean

        Import:
        - borrows
        - allows for the variables and methods from another class to be used

        Extends (Inheritance):
        - owns

        CALLING THE SUPER CLASS CONSTRUCTOR
        - If a Parent/Super Class has default constructor, Child/Sub Class calls it implicitly
        - Otherwise, Parent/Super Class constructor needs to be called explicitly in the Child/Sub Class
        - Super keyword calls a Super Class constructor. Super keyword refers to an object's Super Class.

        this keyword refers to the instances Current Class
        this. calls instance variables and instance methods
        this() calls the constructor of the current class

        super keyword refers to the instances Parent/Super Class
        super.
        super()

        SUPER KEYWORD
        - super() is used to call Parent Class' constructor from Child Class constructor
        - If Parent Class has default (no-argument) constructor, compiler will put super() automatically
        - If Parent Class only has constructor with parameters, Child Class constructor MUST make a matching
          super(parameters) call

        TYPES OF INHERITANCE
        - Single Inheritance
          Child/Sub Classes inherit the features of one Parent/Super Class

                    public class A {               Parent/Super Class A
                    }                                       ^
                    public class B extends A {              |
                    }                               Child/Sub Class B

        - Hierarchical Inheritance
          Multiple Child/Sub Classes inherit the features of one Parent/Super Class

                    public class A {
                    }
                    public class B extends A {
                    }
                    public class C extends A {
                    }
                    public class D extends A {
                    }

                    class Phone { phone: a
                    } a
                    class Iphone extends Phone { // iphone: a, b
                    } b
                    class Samsung extends Phone { // samsung: a, c
                    } c
                    class LG extends Phone { // LG: a, d
                    } d
                    class Nokia extends Phone { // Nokia: a, e
                    } e

        - Multi Level Inheritance
          Child/Sub Class inherits the features of one Parent/Super Class,
          whilst acting as a Parent/Super Class to a GrandChild/Sub Class.

                    public class A {
                    }
                    public class B extends A {
                    }
                    public class C extends B {
                    }

                    class Person { // person: a
                    } a
                    class Employee extends Person { // employee: a, b
                    } b
                    class Tester extends Employee {  // tester: a, b, c
                    } c
                    class ManualTester extends Tester { // manual tester: a, b, c, d
                    } d

        - Multiple Inheritance
          Java DOES NOT SUPPORT multiple inheritance with classes.
          One Child/Sub Class cannot have more than one Parent/Super Class.

        - To check if Inheritance was done correctly, highlight all classes, right click, select Diagrams, then
          show Diagram or Show Diagram Popup .


     */
}
