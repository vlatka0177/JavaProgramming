package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiersIntro;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiersIntro.publicData); // 100 Always visible: different class, package, subClass
        /*
        System.out.println(AccessModifiersIntro.defaultData); // not visible outside the package in which created

        System.out.println(AccessModifiersIntro.privateData); // not visible outside the class in which created  */

        AccessModifiersIntro.method1(); // Public
        /*
        AccessModifiersIntro.method2();

        AccessModifiersIntro.method3();      */
    }
}
