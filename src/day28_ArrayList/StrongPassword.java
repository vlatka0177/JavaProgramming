package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        /*
    1.Write A program that can verify if A password is A strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain A digit
     */

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // Set up temporary value of the boolean variable to false for r2, r3, r4, r5.
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char[] chars = password.toCharArray(); // Convert String characters to Array (data structure).

        for (char each : chars) {
            /* Create A loop. For Each Loop requires A data structure. Accesses each character of the array.
               The loop executes for each character of the password to check if it is an upper case, lower case, digit
               or special character.
               Boolean variable remains false if the conditions are not met. */

            if (Character.isUpperCase(each)) { // Call isUpperCase Method to check if it has upper case
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { // special char
                r4 = true;
            }
            /*
            if(r2 && r3 && r4 && r5){
                break;
            }
            */
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword); // true
    }

    public static boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { // special char
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }

}

