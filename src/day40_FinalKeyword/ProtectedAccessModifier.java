package day40_FinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "Cydeo"; // default access modifier: visible within the same class and package

    protected static String name2 = "WoodenSpoon";
    // protected access modifier: visible within the same class and package, and in a subclass

    static void method1() {
    }

    protected static void method2() {
    }
}
