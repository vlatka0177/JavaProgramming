package day46_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shapeTask.*;

import java.util.ArrayList;

public class PolymorphismIntro {

        /*
        POLYMORPHISM (MANY FORMS)
        - ability of the objects to take on many forms
        - "is a relation" is necessary (inheritance)
        - reference type is a parent class/parent interface
        - object type is a child

        REFERENCE TYPE   OBJECT TYPE
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();
        Animal animal4 = new Eagle(I;

        CALLING METHODS IN POLYMORPHISM
        - only the methods in reference type can be called
        - the called method calls an overridden version from a child class
        - if the method is not overridden, it will call parent/superclass version

        Animal animal1 = new Dog();
        animal1.bark(); // compile error

        Animal animal1 = new dog();
        animal1.eat();

        INSTANCE OF KEYWORD
        - checks if the object is a certain class (returns boolean)

        animal animal = new Dog();
        if (animal instanceof Cat){
        System.out.println("It is Cat");
        }else{
        System.out.println("It is not Cat");
        }

        POLYMORPHISM RULES
        - reference type can be a parent class or parent interface
        - reference type decides what can be accessed/called
        - object type can be any extending or implementing child class
        - object type decides which implementation to execute when the method is called
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
                - casting larger primitives into smaller

        REFERENCE TYPE CASTING
        - casting one reference type to another
        - there must be inheritance (IS A relation) between the object type and reference type that it is cast to
        - ClassCastException is thrown if there is no such inheritance

        UPCASTING
        - casting the smaller reference type (subtype) to larger reference type (super type)
        - done implicitly (cast operator is not required to be given explicitly)
        - achieves polymorphism without any explicit action

        Animal animal1 = new Cat(); // upcasting

        Dog dog = new Dog();
        Animal animal2 = dog; // upcasting

        Phone phone1 = new IPhone(); // upcasting

        Samsung samsung = new Samsung();
        Phone phone2 = samsung; // upcasting

        DOWNCASTING
        - casting the larger reference type (super type) to smaller reference type (subtype)
        - done explicitly
            - cast operator is required to be given explicitly
        - allows access to the features of the objects type that are not in reference type

        Animal animal = new Dog();

        Dog dog = (Dog)animal; // downcasting
        dog.bark();

        Animal animal = new Dog();
        ((dog)animal).bark(); // downcasting

        alt +  -> automatically casts
        */

        public static void main(String[] args) {

            String str = "Wooden Spoon";

            Integer n1 = 2;

            Double n2 = 5.5;

            Boolean r1 = true;

            Object[] array = {str, n1, n2, r1, new Circle(4), new Square(7)};

        /*
            WebDriver driver;
            driver = new ChromeDriver();
            driver = new FireFoxDriver();
         */


            Employee tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
            Employee developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
            Employee teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000.00);
            Employee driver = new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000.00);

            ArrayList<Person> cydeoEmployees = new ArrayList();

            cydeoEmployees.add(tester);
            cydeoEmployees.add(developer);
            cydeoEmployees.add(teacher);
            cydeoEmployees.add(driver);


            System.out.println("-------------------------------------------");

            Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
            employee.work();
            // employee.bugReport();

        /*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();
            driver1.get(amazon)
            driver2.get(google)
            Animal animal = new Dog();
            animal.drink()
            Animal animal = new Cat()
            animal.drink()
            Animal animal = new Tiger()
            animal.drink()
         */

            Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
            animal.drink();
            animal.eat();
            // animal.play();
            //  animal.bark();


            Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
            System.out.println(animal2.isFriendly);
            animal2.play();
            //  animal2.drink();
            //  animal2.eat();


            Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");

            Shape shape = new Circle(5);
            shape.area();

            //  System.out.println( shape.getRadius());
            // System.out.println( shape.PI);

            boolean isSquare = shape instanceof Square;
            boolean isRectangle = shape instanceof Rectangle;
            boolean isTriangle = shape instanceof Triangle;
            boolean isCircle = shape instanceof Circle;

            System.out.println("isSquare = " + isSquare);
            System.out.println("isTriangle = " + isTriangle);
            System.out.println("isRectangle = " + isRectangle);
            System.out.println("isCircle = " + isCircle);


        /*
        WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...
         */

        }
}
