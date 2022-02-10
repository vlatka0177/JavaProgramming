package day45_Abstraction;

public class ExtendsVsImplements {

    /*
    EXTENDS
    - class extends class
    - interface extends multiple interfaces
    - inheritance between the same types: class extends class, interface extends interface          */

    class C {
    }

    class A {
    }

    class B extends A {
    }

    interface Z {
    }

    interface Y {
    }

    interface X {
    }

   /*
    IMPLEMENTS

    - class implements interface
    - class extends first, then implements multiple interfaces

    interface AutoPark;
        autoPark();

    interface AutoPilot extends AutoPark
        selfDriver();

    interface SearchContext:
        findElement();
        findElements();

    interface WebDriver
    */

    class D extends A implements X, Y, Z {
    }
}
