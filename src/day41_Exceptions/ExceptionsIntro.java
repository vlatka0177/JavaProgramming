package day41_Exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {

        /*
        EXCEPTIONS

        - An unwanted or unexpected event
        - Occur during compile time or during runtime
        - Two categories of exceptions
            - Checked exceptions
            - Unchecked exceptions
        - To prevent exceptions from crashing our program, the code must be written to detect and handle them

        Unchecked Exceptions
        - Unexpected event
        - Not checked at compile time
        - Occur during runtime
        - Code will compile, even if the exception is not handled
        - Have IS A relationship with RuntimeException parent class
          (All RunTimeExceptions are unchecked exceptions.)

        Checked Exceptions
        - Unwanted event
        - Checked at compile time
        - Occur during compile time
        - Code will not compile
        - Do not have IS A relationship with RuntimeException parent class
          (All exceptions that are not RunTimeExceptions are checked exceptions.)

        Errors
        - Indicate that an illegal operation is being performed
        - Occur during runtime only
        - Cannot be recovered
        - Not recommended handling them

        Try Block and Catch Block
        - Handle an exception
        - Declared together

        try{

            // try block statements
            // some code that might throw exception

        }catch(ExceptionClass e) {

            // catch block statements
            // handle exception (if try block can't)
        }

        Throwable
        - A parent of both, Exception and Error
        - Not to be used

        Exception Object
        - Every time the exception occurs, Java catches it and assigns it to A variable in A Catch Block
        -

        Multiple Catch Blocks
        - If the code in the try block will be capable of throwing more than one type of exception
        - Specifies all the possible exceptions that could be thrown
        - Parent exception class cannot be placed before the child exception class

        Final - keyword

        Finalize()
        - A method called automatically by the Garbage Collector when an object becomes unreferenced,
          so that the object is destroyed

        Finally Block
        - A block of try catch.
        - It always gets executed.
        - The only way to stop the execution of the Finally Block is to  explicitly terminate the program
          with System.exit(0) .

        Throws Keyword

        Throw Keyword
         */



    }
}
