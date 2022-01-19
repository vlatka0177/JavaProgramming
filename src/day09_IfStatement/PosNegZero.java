package day09_IfStatement;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;

        /*
        Independent If Statements
        Java Compiler has to execute each statement one by one, which is inefficient.
        Thus, used only when there is one condition.
         */

        if(n>0){
            System.out.println("Positive");
        }

        if(n<0){
            System.out.println("Negative");
        }

        if(n==0){
            System.out.println("Zero");
        }

        System.out.println("-----------------------------------------------------------------");

        /*
        Multi-branch If Statements
        Once the condition is true, Java Compiler skips executing other code blocks.
        Efficient, so it HAS to be used when there are multiple conditions.
         */

        boolean positive = n > 0;
        boolean negative = n < 0;

        if(positive){
            System.out.println("Positive");
        }else if(negative) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        System.out.println("---------------------------------------------------------------------");

        if(positive){
            System.out.println("Positive");
        }

        if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        // If...Else statements can NEVER be applied for tasks that require more than two conditions.


    }
}
