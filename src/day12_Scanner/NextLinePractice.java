package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* Enter key is left in the scanner's memory after nextInt().
           Prevents nextLine input from the user after nextInt(), nextDouble(). A bug.
           input.nextLine(); is used to remove the stored enter key from the scanner. */

        System.out.println("Enter your age");
        int age = input.nextInt(); // 19 Enter key (Moves into the Scanner.)

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();
        /* User enters 3.5 Enter. nextDouble() ignores Enter. Enter is stored in the scanner's memory.
        Assigned by default to the schoolName. User is not able to enter the school name.
        */

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

        /* 70% of learning a programming language comes from practice.
           30% comes from reading, watching videos, lectures. */

        input.close();

    }
}
