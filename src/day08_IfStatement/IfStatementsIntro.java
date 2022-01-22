package day08_IfStatement;

public class IfStatementsIntro {

    public static void main(String[] args) {

        /*
        1. Single If Statement
        Checks A single condition.
        If the condition evaluates to true, any statements in the subsequent code block
        are executed.

        if(Condition){
           Statements
        }

        2. If...Else Statement
        Checks A condition when there are only two options/possibilities.

        if(Condition){
            StatementA
        }else{                 // otherwise
            StatementB
        }

        If the condition resolves to true, the first code block (statement) is executed.
        If the condition resolves to false, the second code block is executed instead.

        StatementA: if condition MUST be true
        StatementB: if condition MUST be false

        StatementA: if condition MUST be false
        StatementB: if condition MUST be true

        3. Multi-branch If Statement
        Nested to create an else if clause.
        Used to make A decision among more than two alternatives.

        if(Condition1){
            Statements
        }else if(Condition2){
            Statements
        }else{
            Statements
        }

        Else if block is used between statements.
        Else block is used for the last statement.

        Only one code block (statement) gets executed: the first one that is true.

        StatementA: Condition1 MUST be true.
        StatementB: Condition1 MUST be false, Condition2 MUST be true.
        StatementC: Condition1 and Condition2 MUST be false

        one condition ===> Single If Statement
        two conditions ===> If...Else Statement
        multiple conditions ===> Multi-branch Statement

        4. Nested If Statement
        Used for creating A pre-condition.
        It is used if one condition can be evaluated to several alternatives.

         if(Condition){
            if(Condition){
                Statements
         }
           }
         */
    }
}
