package InterviewQuestions;

import java.util.Scanner;

public class Codility {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int N = scan.nextInt();

        if(N<=0){
            throw new RuntimeException("Invalid entry. Integer number must be positive.");
        }

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0 && i % 2 != 0 && i %5 != 0) {
                System.out.println("Test");
            } else if (i % 5 == 0 && i % 2 != 0 && i % 3 != 0) {
                System.out.println("Coders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
