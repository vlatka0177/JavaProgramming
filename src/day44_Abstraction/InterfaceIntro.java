package day44_Abstraction;

public class InterfaceIntro {

    /*
    INTERFACE
    - a blueprint of a class, but it is not a class
    - interface keyword is used to create interface
    - specifies the behavior that a class should implement
    - provides additional methods that subclasses need
    - 100% abstraction can be achieved by using interface (requires inheritance)

    Abstract class provides methods that are common for all subclasses.
    Interface allows that only some subclasses inherit a method.
        - In animal class, parrot and dove subclasses can implement fly method, but not for other animals
        - In shape class, cube and cylinder can implement volume method, but not circle and square

    - variables are static and final by default
    - can have static, abstract, and default methods only
    - public is the only access modifier that can be used, and is given by default
    - abstract keyword is given by default to the abstract methods of interface

                public interface Interface1{
                int a = 100; // static and final by default
                void method1(); // abstract method
                }
     */
}


