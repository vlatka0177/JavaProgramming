package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        /*
        Ternaries: shortcut of If Statement

        Single If
        (Condition)?

        Else
        (Condition)?
                    :     signifies else

        Else...If
                    :(Condition)?
         */

        int n = 100;

        if(n%2 == 0){
            System.out.println("Even");  // String
        }else{
            System.out.println("Odd");  // String
        }

        System.out.println("----------------------------------------------------------");

        // Ternary can only be used when every block is returning the same data type.

        String result1 = (n%2 == 0)? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("-----------------------------------------------------------");

        int age = 23;

        /*
        If...Else Statement

        if(age >=21){
            System.out.println("Eligible");  // String
        }else{
            System.out.println("Not Eligible");  // String
        }

        Ternary

        System.out.println((age >= 21)? "Eligible" : "Not Eligible");

        Preferred way is to assign ternary to A variable, so that it can be reused with
        different values.
         */

        String result2 = (age >= 21)? "Eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println("------------------------------------------------------------------");

        int number = 100;

        /*
        if(number>0) {
            System.out.println("Positive");
        }else if(number < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
         */

        String result3   = (number>0)? "Positive" :(number <0)? "Negative" : "Zero"  ;

        System.out.println(result3);

    }
}
