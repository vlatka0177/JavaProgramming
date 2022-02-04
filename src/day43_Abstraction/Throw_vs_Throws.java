package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score = new Scanner(System.in).nextInt();

        // CREATING EXCEPTION
        if (score < 0 || score > 100) {
            throw new RuntimeException("Invalid score: " + score); // Throw is within a method's body
        }
        // If the condition is met, the program gets terminated and other code blocks never get executed.

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

        /*
        Exit code 0 - program ran without any issues
        Exit code 1 - there was a problem running the program */

        public static void method1() throws InterruptedException{
            Thread.sleep(5000);
        }
        /*     Checked exception:
               - throw catch to handle the exception permanently
               - throws keyword in the method signature fixes it once, temporarily
        */
    }

