package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // outer class, does not allow static modifier

    static class class1 { // inner class, nested within another class, allows static modifier,

    }

    public static int num = 100; // static variable

    public static void method() { // static method

    }

    static { // static block
    }

    // Static variable and static method are called through the class.

    // toString() is instance method because it uses instances
}



