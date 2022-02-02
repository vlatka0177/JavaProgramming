package day42_Exceptions;

class StudentException extends RuntimeException{ // custom unchecked exception

    public StudentException(){
        super("Time for a short break");
    }

    public StudentException(String message){
        super(message);
    }
}

class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args)  {

        // Throw new StudentException("It's time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}