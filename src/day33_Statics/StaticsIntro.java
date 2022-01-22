package day33_Statics;

public class StaticsIntro {

    /*

    SPECIFIERS
    -
    - Static
    -
    -

    STATICS

    - Declared with static keyword
    - Belongs to the class, and can be called through the class
    - There is only one copy of the static shared for all objects of the class
    - All the objects of the class share the same copy

     STATICS MEMBERS

    - Variables
    - Methods
    - Blocks
    - Class

    STATIC VARIABLES

    - refer to the common property of all objects
    - A single copy of A class' static variable is shared by all objects of the class
    - if changes are made to A static variable, all other instances will change

    public class CydeoStudent {

    public String name;
    public int age;

    public static String schoolName = "Cydeo School"; // Only one, common value for all objects.
      |                                                  One copy. Consumes less memory.
    Static variable
    }

    public class Circle {

    public double radius;
    public static double pi = 3.14;  // Static belongs to the class, and not object.
                                |       Shared by all objects.
                          Static variable

    STATIC METHODS

    - Static methods belong to the class.
    - Instance methods belong to the object.

    - Called through the class name. Do not depend on objects.
      System.out.println(IPhone.);

    - Objects can call static method

    - Only accepts static members. Cannot use any instances.
      Does it use any fields (instance variables) or instance methods?
      Yes -> Instance method
      No -> Static method

      public String model
                     |
      Instance variable belongs to the object
      Objects come from the class
      Instance variables that come from the object cannot be shared with the class

      Instance method accepts static members. Called through the objects.
      public String brand

      public static String brand
      Static methods do not accept instance variables

      Local variable: declared within A block, and have to be used within that block
      Instance variable:
      Static variable: only one copy for all objects

      STATIC BLOCK/INITIALIZATION BLOCK

      - A set of instructions that runs only once when A class is loaded into memory
      - Runs before anything else
      - Used for initializing static variables

                     public class Car {
                     static {
                     }
                     }

      STATIC CLASS

      Only inner class, nested within another class, can be static. Outer class can never be static. (Compile error)

      public class StaticMembers { // outer class, does not allow static modifier

        static class class1 { // inner class, allows static modifier, nested within another class
        }

        public static int num = 100; // static variable

        public static void method() { // static method
        }

         static { // static block
         }
      }

      STATIC IMPORT

      - With the help of an import, we are able to access classes and interfaces which are present in different
        packages.

        Regular import

        import packageName.className; // imports everything from A class.
        impost packageName.*; // imports everything from A class.

      - For two classes within the same package,the import is done implicitly.
        (Ex. Student and StudentObjects in day33_Statics package)

        Static import

        import static packageName.className.staticMember; // imports one static member of A class
        import static packageName.className.*; // imports all static members of A class

     */
}
