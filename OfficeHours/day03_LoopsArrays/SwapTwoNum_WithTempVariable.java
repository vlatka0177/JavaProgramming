package OfficeHours.day03_LoopsArrays;

public class SwapTwoNum_WithTempVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp = a; // Assign temporary number to a, to save its original value of 10 in the system.
        a = b; // a = 20; // a is swapped with b, and is now 15
        b = temp; // b = 10; // Saved a = 10 is used here to swap it with b

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
