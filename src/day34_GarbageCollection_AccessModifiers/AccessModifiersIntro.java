package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersIntro {

    public static void main(String[] args) {

        /*
        ACCESS MODIFIERS
        - define accessibility

        public > protected > default > private

                               Reachable:
        public                 always: different class, package, Subclass, World
        protected              within the same class, package, Subclass
        default(no modifier)   within the same class, within the same package
        private                only within the same class
        */

        System.out.println(publicData); // 100 - visible within the same class
        System.out.println(defaultData); // 200 - visible within the same class
        System.out.println(privateData); // 300 - visible within the same class


    }

    public static int publicData = 100;
    static int defaultData = 200; // Access Modifier: default
    private static int privateData = 300;

    public static void method1() {
        System.out.println("Public");
    }

    static void method2() {
        System.out.println("Default");
    }
    // To use default access modifier, do not specify any access modifier.

    private static void method3() {
        System.out.println("Private");
    }
    // File name and public class name have to be the same in Java.
}
