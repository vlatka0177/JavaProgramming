package OfficeHours.day06_CustomMethods;

public class WrapperTask {

    /*
    String str = "(((W&e**_lco73me %T%o Co!@$, , <r>e <J...$@av^453a";
    Write a method that returns: Welcome to Core Java
    */

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$, , <r>e <J...$@av^453a";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) { // If the character is upper case
                result += " "; // add it in result
            }
            if (Character.isAlphabetic(str.charAt(i))) {
                result += str.charAt(i); // add to String result
            }
        }
        System.out.println(result.trim()); // Welcome To Core Java
    }
}
