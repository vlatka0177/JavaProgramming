package day15_String_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum = 0;
        // +1 +2 +3 +4 ... +100

        for (int i = 1; i < 101 ; i++) { // shortcut: type fori enter
                                         // i: 1, 2, 3, 4, 5, 6, ... 100
            sum += 1;
        }
        System.out.println(sum); //5050

        System.out.println("----------------------------------------------------------------");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {

            System.out.println("Enter A number:");
            total += scan.nextInt();
        }
        System.out.println("total = " + total);

        scan.close();
    }
}
