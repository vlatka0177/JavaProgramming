package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt(); // 56 Enter

        System.out.println("Enter your gender");
        String gender = scan.next(); // Female Enter

        // Two enter keys are in the scanner

        scan.nextLine(); // Clears Enter from nextInt() and Enter from next()

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        /* When entering nextLine method, always check the previous method.
           If the previous method was any other than nextLine method, then
           next method is needed before the nextLine method to clear Enter. */

        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        /*
        Answers to practice tasks are on Github.
        Replit answers are on Canvas. 30 min per task max.

        1. Create A class called MyInfo. Write A program that can ask the user to:

        Analyse the data first and assign an appropriate method.
        Then, import the scanner.
        If the name of the scanner's variable is input, call the scanner input.
        If the name of the scanner's variable is scanner, call the scanner scan.

            1. Enter your age (int ---> nextInt())
            2. Enter your gender (String- One word ONLY ---> next()) nextLine()
            3. Enter your full name (String- Multiple words ---> nextLine())
            4. Enter your phone number (long ---> nextLong())
            5. Enter your zip code (int ---> nextInt()) nextLine()
            6. Enter your School name (String- Can be Multiple words ---> nextLine())
            7. Enter your city name (String- Can be Multiple words ---> nextLine())
            8. Enter your state name (String- One word ONLY ---> next())
            9. Enter your building number (int ---> nextInt()) nextLine()
            10. Enter your Street name (nextLine())

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        building number Street
                        City, State ZipCode

            6. school name
            */

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: \n\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + cityName + " " + stateName + " " + zipCode);
        System.out.println("School name: " + schoolName);

    }
}
