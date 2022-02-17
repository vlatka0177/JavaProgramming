package InterviewQuestions;

import java.util.Scanner;

public class Codility2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int N = scan.nextInt();

        if (N <= 0) {
            throw new RuntimeException("Invalid entry. Integer number must be positive.");
        }

        for (int i = 1; i <= N; i++) {

            if (i % 30 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 6 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 15 == 0) {
                System.out.println("TestCoders");
            } else if (i % 10 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
//command + return