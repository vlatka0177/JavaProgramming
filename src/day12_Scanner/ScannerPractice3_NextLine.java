package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); /* User types Wooden Spoon and presses Enter.
                                               NextLine method reads the enter key. Stops. */

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine(); // Java Programming Language. Enter.

        System.out.println("Enter your age: ");
        int age = input.nextInt(); /* 24 Enter. Reads 24 and ignores Enter key.
                                      24 assigned to the age. Enter is left in the scanner. */

        input.nextLine(); // It takes out the Enter key that was left in the scanner after nextInt().

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        /* Enter key is automatically assigned from the scanner's memory (placed there after 24 Enter)
         to the school name. That is why schoolName is empty (A bug).
         To prevent that from happening, input.nextLine(); needs to be entered after 24 to clear the
         scanner's memory before using another nextLine method.
         All other methods, except nextLine method, ignore the enter key. */

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName" + schoolName);

        input.close();
    }


}
