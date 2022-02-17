package day47_Polymorphism;

public class ObjectOrientedProgrammingAdvantages {

    public static void main(String[] args) {

        /* OBJECT ORIENTED PROGRAMMING ADVANTAGES
            - improves re-usability
            - easy to maintain
            - less memory
            - less code
            - avoids duplication
            - flexible

            1. ENCAPSULATION
            - hiding the data by giving private access modifier

                getter (reads)
                setter (writes)

                If private data is final, setter cannot be generated.
                POJO

            2. INHERITANCE
            - building "is a relationship" (parent/superclass and child/subclass)
            - child class inherits all the variables and methods that are visible from the parent class
            - parent class does not inherit anything from a child class
            - object class is the parent of all the classes by default

            TestBase
            driver

            set up
                set the driver
                open the browser
                maximize the window
                implicitWait
                navigateToURL

            tearDown(@AfterMethod)
                TakeScreenshot(If stalled)
                Quit

            ParentClass
                static void method1() {
                    "Parent version"
                }

            3. ABSTRACTION
            - hiding the implementation details
            - Abstract method is a method without the body, meant to be overridden
            Two ways
            - abstract class
                - not concrete (no objects)
                - meant to be a parent
                - contains common features
                - class can extend one abstract class only
            - interface
                - not a class (does not have instance variables and instance methods, blocks, constructors)
                - static and final variables only
                - abstract method, static method, default method (treated as instance method by the child classes)
                - only public access modifier
                - meant to be implemented
                - used for providing additional methods that the classes need
                - used for achieving 100% abstraction
                - class can implement multiple interfaces
                - interface examples: WebDriver, WebElement, TakeScreenShot, JavaScriptExecutor...

            4. POLYMORPHISM
            - ability of the objects to take on many forms
            - reference type is a parent class/interface, and the object type is a child class

            Shape shape = new Circle();
            shape.area()

            - method overriding
                - happens in the child/subclass (inheritance is a must)
                - one method with multiple implementations
                - cannot override methods with static, final or public keywords
                -
            - method overloading
                - happens in the same class
                - any method can be overloaded, including the main method
                - access modifier does not matter, as long as it is the same or more visible

         */
    }
}
