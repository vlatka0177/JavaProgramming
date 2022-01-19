package day09_IfStatement;

public class PassedOrFailed {

    public static void main(String[] args) {

        int score = 75;

        if(score >= 60){
            System.out.println("Congrats, you passed.");
        }else {
            System.out.println("Failed");
        }

        /*
        Java Compiler executes only the first code block (statement).
        This is more efficient than having two Single If statements.
         */

    }
}
