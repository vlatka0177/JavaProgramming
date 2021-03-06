package day43_Abstraction;

public class AbstractionIntro {

    /*
    OBJECT ORIENTED PROGRAMMING

    1. ENCAPSULATION
    - Hiding the data

    2. INHERITANCE
    - Creating IS A relation between classes (parent/super and child/sub)
    - Common features are created one time in the parent class, and are then inherited by the child class
    - Easy to maintain
    - Method Overriding
          - Gives multiple, different implementations to the method

     3. POLYMORPHISM

     4. ABSTRACTION

     - Process of hiding implementation details from the user
     - Only the functionality will be provided to the user
     - Focusing on the essential qualities of something rather than one specific example.
       (Ignoring the irrelevant and unimportant)
     - User will have information on what the object does instead of how it does it

     ABSTRACT METHOD
     - Method without the body (implementation)
     - Abstract keyword is used to create abstract method in superclass/parent

         public abstract double area();

     - Meant to be overridden in a subclass/child
     - Final and static method cannot be overridden, so abstract method cannot be final or static
     - Cannot have private access modifier
     - Can only be created in an abstract class or in an interface

     ABSTRACT CLASS
     - a parent/super class

       public abstract class Shape {
       }

     - meant to be inherited (has to contain common features of the class)
     - provides reusable variables and methods to child/subclasses
     - abstract keyword creates abstract class
     - it cannot be instantiated (cannot create objects)

     CREATING OBJECTS
     - a child/subclass of an abstract class is called a concrete class and can be instantiated (create objects)

       public class Circle extends Shape {
       }

     - a concrete class must implement all the inherited abstract methods
     - Compile error when class is created in subclass/child and there is an abstract method in the superclass/parent
     - Hover over light bulb icon. Click on implement methods to override the abstract method from the superclass/parent
       (Alternatively, generate an override)

       @override
       public double area() {
       }

                   REGULAR CLASS                                  ABSTRACT CLASS
     Can have constructors,instances and statics  Can have constructors,instances and statics
     Can be instantiated                           Cannot be instantiated (cannot create objects)
     Cannot have abstract method                   Can have abstract method
     Can be declared as final                      Cannot be declared as final
     */
}
