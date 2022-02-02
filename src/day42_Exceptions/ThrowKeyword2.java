package day42_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        // UNCHECKED EXCEPTION
        throw new NoSuchElementException("No such element.");
        /* throw keyword + new keyword to create an object from the exception class + constructor NoSuchElementException();
           The name of the constructor must match the import name.
         */

        /* CHECKED EXCEPTION: Error. Compiler message, "Unhandled exception"
           throw new InterruptedException();
         */
    }
}
