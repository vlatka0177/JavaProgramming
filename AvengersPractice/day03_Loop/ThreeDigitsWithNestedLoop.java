package AvengersPractice.day03_Loop;

public class ThreeDigitsWithNestedLoop {

    public static void main(String[] args) {

        // Print all three-digit numbers

    for (int a = 1; a <= 9; a++) {
        for (int b = 0; b <= 9; b++) {
            for (int c = 0; c <= 9; c++) {
                int abc = 100 * a + 10 * b + c;
                //  253 = 100*2 + 10*5 + 3

                System.out.println(abc);
            }
        }
    }


    }

}
