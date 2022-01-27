package day42_Exceptions;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        /*
        CHECKED EXCEPTION
        Compiler's first suggestion: "Add exception keyword in the method signature" (throws keyword)
        Compiler's second suggestion: "Surround with Try/Catch"

        TRY CATCH uses multiple blocks to resolve the error.
        Permanent solution. The checked exception will not occur again.

        THROWS KEYWORD
        - Used within the method signature
        - Informs the compiler
        - Used for handling CHECKED EXCEPTION
        Temporary solution:
        - Whenever the method with throws keyword in its signature is called, it resolves only the initial
          checked exception. If the method is called again, the exception occurs again. Then, the checked
          exception either has to be handled again or the method has to be declared again.
         */


        System.out.println("------------------Test 1---------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------------------Test 2---------------------");




    }
}
