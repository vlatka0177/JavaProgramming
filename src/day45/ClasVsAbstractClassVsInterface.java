package day45;

public class ClasVsAbstractClassVsInterface {
    /*
    CLASS
    - blueprint of objects
    - specifies what the object must have
    - can be instantiated
    - can be final

    ABSTRACT CLASS
    - meant to be a parent
    - can be a child abstract class, but must be a parent/superclass to other child/subclasses
        - Person (abstract class) - Employee (child abstract class that extends to 4 classes)
                                              Teacher, Driver, Tester, Developer
    - can have abstract method
    - cannot be instantiated
    - cannot be final
    - provides variables and methods to all child/subclasses
    - must contain the COMMON FEATURES of ALL the child/subclasses

    INTERFACE
    - blueprint of a class
    - specifies what the classes must have
    - cannot be instantiated
    - cannot be final
    - provides ADDITIONAL methods only TO A FEW child/subclasses, not all of them

    INTERFACE CAN HAVE
    Variables: final, static ONLY
    Methods: abstract, default, static
    Access modifier: public ONLY

    INTERFACE CANNOT HAVE
    - instance variables
    - instance methods
    - constructor
    - blocks

    WE NEED INTERFACE
    - one class can extend one class ONLY
    - one class can implement multiple interfaces

    100% abstraction

    ABSTRACT CLASS vs INTERFACE SIMILARITIES
    - used for achieving abstraction
    - cannot be instantiated
    - cannot be final
    - meant to be inherited

     ABSTRACT CLASS vs INTERFACE DIFFERENCES

     ABSTRACT CLASS
     - one class can extends one abstract class
     - can have instances & statics
     - can have a constructor
     - 4 access modifiers

     INTERFACE
     - one class can implement multiple interfaces

    */
}
