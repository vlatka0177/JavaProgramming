package AvengersPractice.day03_Loop;

public class SwapTwoNumbers_WithoutTempVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("-----------------------------------------------------------");

        int c = 20;
        int e = 30;

        System.out.println("c = " + c);
        System.out.println("e = " + e);

        c = c + e; // 20 + 30 = 50
        e = c - e; // 50 - 30 = 20
        c = c - e; // 50 - 20 = 30

        System.out.println("c = " + c);
        System.out.println("e = " + e);

    }
}
