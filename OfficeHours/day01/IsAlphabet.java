package OfficeHours.day01;

public class IsAlphabet {

    public static void main(String[] args) {

        /*
        Create a program to check whether a character is an alphabet.

        INPUT : '.'			EXPECTED : Your character is not in alphabet.
        INPUT : 'a'			EXPECTED : Your character is an alphabet.
        */

        char character = ',';

        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
            System.out.println("Your character is in alphabet.");
        }else {
            System.out.println("Your character is not an alphabet.");
        }

    }
}
