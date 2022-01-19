package AvengersPractice.day03_Loop;

public class LoopIntro {

    public static void main(String[] args) {

       /*
        For Loop
        initialization int i = 0
        test i <= 50
        increment i++
        */

        // Print numbers from 1 to 50.

        for (int i = 1; i <= 50; i++) {

            System.out.print(i + " ");     // Print statement has to be within the For Loop brackets
        }
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------------");


        // Print even numbers from 1 to 100.

        for (int j = 2; j <= 100; j+=2) {

            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------");


        // Print odd numbers from 1 to 100.

        for (int k = 1; k <= 100; k+=2) {

            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------");


        // Print numbers from 1 to 100 that are divisible by 5.

        for (int m = 5; m <= 100; m+=5) {

            System.out.print(m + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------");


        // Print even numbers from 100 to 0.

        for (int n = 100; n >= 2 ; n-=2) {

            System.out.print(n + " ");
        }

        
    }

}
