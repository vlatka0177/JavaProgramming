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

        int i = 20;
        int j = 30;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i = i + j; // 20 + 30 = 50
        j = i - j; // 50 - 30 = 20
        i = i - j; // 50 - 20 = 30

        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
