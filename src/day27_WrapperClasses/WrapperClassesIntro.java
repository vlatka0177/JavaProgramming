package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        /*
       Wrapper Classes

        - Dedicated classes of eight primitives
        - Presented in "java.lang" package
        - Used to "wrap" the primitive data type into an object of that class
          - Object is an instance of A class.
        - Data structures:
          - Array: supports primitives and non primitives
          - Collection: ONLY supports non-primitives
          - Map: ONLY supports non-primitives
        - Provide the mechanism to convert primitives into an object and object into A primitive

        Autoboxing v Unboxing

        - Autoboxing converts A primitive into A wrapper class object
        - Unboxing converts A wrapper class object into A primitive

        Primitives                 Wrapper Classes
        byte ==================>   Byte
        short    Autoboxing        Short
        int                        Int
        long                       Long
        float                      Float
        double                     Double
        char      Unboxing         Char
        boolean <================  Boolean

        Autoboxing. Done implicitly.
        A primitive can only be converted to its own wrapper class. int ==> Int
        */

        int num1 = 200;

        Integer n1 = num1; // Autoboxing

        int num2 = n1; // Unboxing. Done implicitly.

        System.out.println("----------------------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue; //Unboxing.

        Byte b1 = 25;

        byte a1 = b1; // Unboxing
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("---------------------------------------------------");

        int num3 = 200;
        /*
        Long l2 = num3;
        Double d1 = num3;        */

        Integer num4 = num3; // Autoboxing

        System.out.println("----------------------------------------------------");

        Integer z = 900;
        Integer y = z; // Assigning only

        System.out.println("-----------------------------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};
    }
}
