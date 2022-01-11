package day35_Encapsulation.encapsulation;

public class EncapsulationIntro {

    /*
    OBJECT ORIENTED PROGRAMMING
    - A design pattern of applications in an organized and modular way.
    - Allows the common features in multiple classes and objects to be reused.
    - Written in centralised structure, which makes it easy to maintain. One change affects all objects

    PRINCIPLES OF OOP
    - Encapsulation
    - Inheritance
    - Abstraction
    - Polymorphism

    ENCAPSULATION
    - An object hides its internal data from code that is outside the class
    - Only the current class' methods can directly access and make changes to the instance variables
    - Hide an INSTANCE VARIABLE by giving a private access modifier, and making the methods that access
      those fields public
    - These public methods are called getters and setters (accessor and mutator)

    Private access modifier
    - When applied to a class member, the member cannot be accessed by a code outside its class

    Public access modifier
    - When applied to a class member, the member can be accessed by a code inside or outside the class

    Getters and Setters
    - Public instance methods, used to protect data and make code more secure
    - Getter is used for reading the private data (instance variable) only
    - Setter is used for writing (modifying) the private data (instance variable) only

    Getters Method

            public class Person{
                private int age;
                public int getAge(){
                     return age;
                }
            }

      - A public instance return method that returns the private instance variable
      - Does not pass any parameters
      - Return type must match the data type of the private instance variable

      Setter Method

            public class Person{
                private String name;
                 public void setName(String name){
                 this.name = name;
                 }
            }

      - A public instance method with the return type of VOID
      - Passes a parameter, and parameter will be assigned to the private instance variable
      - Data type of the parameter must match the data type of the private instance variable
     */
}
