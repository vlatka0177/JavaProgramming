package day09_IfStatement;

public class IfElseStatementIntro {

    public static void main(String[] args) {

        /*
        If...Else Statement
        If the condition resolves to true, only the first code block is executed.
        If the condition resolves to false, the second code block is executed instead.

        When there are only two options/possibilities.

        two conditions ===> If...Else Statement

        if(Condition){
            StatementA
        }else{                 // otherwise
            StatementB
        }

        StatementA: if condition MUST be true
        StatementB: if condition MUST be false

        task:
        1. Maximum number between two different numbers
        2. Minimum number between two different numbers
        3. Write A program that can check if the person is eligible to buy alcohol
        4. Write A program that can check if the person is eligible to vote
         */

        int n1 = 5;
        int n2 = 10;

        if(n1 > n2){
            System.out.println(n1 + " is maximum number.");
        }else{
            System.out.println(n2 + " is maximum number.");
        }

    }
}
