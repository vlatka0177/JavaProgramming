package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {

      /*
    Given two double variables n1, n2 and A char variable named operator,
    use switch statement to calculate the result of n1 and n2 based on the given operator.

    Valid operators are: 1, +, *, /
     */

     double n1 = 200.5,
            n2 = 10.5;
     char operator = '+';

     boolean valid = operator == '+' || operator == '-'  || operator == '*' || operator == '/';

     if(valid){ // Operator: +, -, *, /

         switch(operator) {

             case '+':
                 System.out.println(n1 + n2);
                 break;

             case '-':
                 System.out.println(n1 - n2);
                 break;

             case '*':
                 System.out.println(n1 * n2);
                 break;

             default:
                 System.out.println(n1 / n2);

         }


         }

    }


}
