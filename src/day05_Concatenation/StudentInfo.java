package day05_Concatenation;

public class StudentInfo {

    public static void main(String[] args) {

        String student_name = "Vlatka"; // Variable name has to be readable.
        int age = 56;
        char gender = 'F'; // char variable is always in ' '
        String schoolName = "Cydeo";
        String phoneNumber = "(410)-440-7486";
        boolean isFullTime = true;
        double GPA = 3.9;

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("GPA = " + GPA);

    }
}

/*
2. Create a class called StudentInfo, and declare variables for the followings:
                1. student name (String)
                2. age (int)
                3. gender (char)
                4. school name (String)
                5. phone number (String) Format: (###)-###-###
                6. full time (boolean)
                7. GPA (double)
 */