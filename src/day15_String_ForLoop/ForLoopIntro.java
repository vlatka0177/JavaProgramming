package day15_String_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        /*
        Loops: repeated action

        Check A condition.
        If condition returns true, A code block will run.
        The condition will be checked again.
        It repeats until condition returns false. Terminates the loop.

        Three types of loops:

        1. For Loop
        - iteration is fixed
        - Syntax:

        for (initialization; condition; iteration){      for(i = 1; i <= 5; i++){
        Statement;                                       System.out.print(i + " ");
        }                                                }

        - initialization is the starting point of the loop
          int i = 1;
        - condition is ending point, based on the variable declared in initialization
          i <= 5, i >= 0
        - iterator is correlated to the condition.
          Runs long enough to make the condition false
          i++, i--

        2. While Loop
        - iteration is not fixed (do not know how many times the loop needs to be repeated)
        - repeated If Statement until the condition becomes false
        - Syntax:
                                         int i = 1;
        while(condition){                while(i <= 5){
        Statement                        System.out.println(i)
        }                                i++;
                                         }

        3. Do-while Loop
        - iteration is not fixed
        - Syntax:
                                        int i = 1
        do{                             do{
        statements                      System.out.println(i);
        }while(condition);              i++;
                                        }while(i <=5);

        - Do block gets executed at least once
        - Curly braces are only mandatory if there is more than one statement within the loop body.
          Without the curly braces, the loop repeats only one statement.
          It is recommended to always include curly braces.

        4. Nested Loop:
        - loop inside A loop (inner and outer)
        - outer loop repeats the inner loop

        1. For Loop
        Runs the given code A specific number of times.
        Initialization is the starting point of the loop.
        Condition is the ending point of the loop.
        Iterator is responsible for making the condition false.

        Initialization
             |    ------------------------------------
             v     True                               |
         Condition ---->  Statement ----> Iterator ----
             |
             v
           False
             |
             v
       Loop terminated

       for(initialization; condition; iteration) {
       Statement
       }

       The initialization expression initializes the loop.
       When the condition expression evaluates to false, loop stops running.
       The iteration gets executed after each iteration through the loop.

         */

        System.out.println("-----------------------------------------------------------");

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println("------------------------------------------------------");

        /*
        4. iteration - not mandatory, but without it the loop is infinite
           i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
           When i increases to 11, the condition i<=10 becomes false. Loop terminates.
                                 |                                            */
        for(int i = 1; i <= 10; i++ ) {
            /*    |       |
                  |   2. condition - mandatory - if true, iterator gets executed
        1. initialization - mandatory                                            */
        }

            System.out.println("Hello World!"); // 3.
                                                // i: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        }

    }

