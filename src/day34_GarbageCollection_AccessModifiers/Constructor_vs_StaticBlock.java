package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    // Static block is used to initialize the common value for all objects

    static {

        System.out.println("Static Block"); // Static Block
    }

    public static void main(String[] args) {

        // Constructor is used to initialize each individual variable in each object.

        new Constructor_vs_StaticBlock(); // 1
        new Constructor_vs_StaticBlock(); // 8
        new Constructor_vs_StaticBlock(); // 5
        new Constructor_vs_StaticBlock(); // 10
        new Constructor_vs_StaticBlock(); // 3

    }
}
