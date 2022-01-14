package day38_Inheritance;

public class MethodOverloadingVsMethodOverriding {

    /*
    METHOD OVERLOADING
    - Multiple different methods having the same name
    - Parameter must be different
    - Return type and access modifiers do not matter
    - Any method in Java can be overloaded, including the Main Method

    METHOD OVERRIDING
    - One method having multiple different implementations
    - Overriding a method must take place in a subclass (child)
    - Less memory usage
    - Improves the re-usability of the code

                        Animal
                        eat()

    Dog                 Cat                 Fish
    eat()               eat()               eat()
    eats dog food       eats cat food       eats fish food


                        Shape
                        area()
                        perimeter()

    Circle              Square              Rectangle

    area()              area()              area()
    radius*radius*pi    side*side           width*length

    perimeter()         perimeter()         perimeter()
    2*radius*pi         side*4              2*(width + length)


    METHOD OVERRIDING RULES
    - Must occur in the subclass (child class)
    - Return type, method name and parameters must be the same
    - Access modifier needs to be the same or more visible
      public > protected > default > private
    - CANNOT override methods with
            - Private access modifier
            - Static specifier
            - Final specifier
    - CAN override
            - Instance methods that are not static or final

            Car
                start() {car started}

            Toyota extends Car
                start()
                    twist the key in ignition

            Audi extends Car
                start()
                    push start button

            Tesla extends Car
                start()
                    say "Start"

            BMW extends Car
                start()
                    call mechanic
                    jump start

       toString() and equals() Methods are needed for every single object.
       Object class is presented in java.lang package.
            - Parent of all the classes.
            - Imported implicitly. Extends to Object class.
            - Declared in one place, one time only.

            Tesla Class
            - explicitly extended Car Class
            - implicitly extended Object Class
     */
}
