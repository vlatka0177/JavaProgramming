package OfficeHours.day03_LoopsArrays;

public class SwapTwoNum_WithTempVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp = a; // Assign temporary number to A, to save its original value of 10 in the system.
        a = b; // A = 20; // A is swapped with B, and is now 15
        b = temp; // B = 10; // Saved A = 10 is used here to swap it with B

        System.out.println("A = " + a);
        System.out.println("B = " + b);

    }

}
