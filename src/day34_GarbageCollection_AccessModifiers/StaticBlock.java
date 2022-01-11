package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method"); // Executed fourth
    }

    static { // Runs first before anything, and only runs one time

        System.out.println("Static Block 1"); // Executed first
    }

    static {

        System.out.println("Static Block 2"); // Executed second
    }

    static {

        System.out.println("Static Block 3"); // Executed third
    }
}

