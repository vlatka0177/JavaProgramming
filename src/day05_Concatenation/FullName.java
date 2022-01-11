package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Vlatka";
        String lastName = "Persin";
        int age = 56;
        String jobTitle = "SDET";
        String companyName = "Apple Inc.";
        int salary = 100_000;

        String fullName = firstName + " " + lastName;
        //To space variables insert + " " + between them.

        System.out.println(fullName);

        System.out.println("The full name of the person is " + fullName + ".");

        // _______ is _____ years old.
        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle + ", and works at " + companyName);
        System.out.println(fullName + "'s salary is $" + salary + ".");

    }
}
