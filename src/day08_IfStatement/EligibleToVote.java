package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // True

        // Eligible to vote
        if(isEligible){
            System.out.println("Eligible");
        }
        // True. Will be printed.

        // Not eligible to vote
        if(!isEligible){
            System.out.println("Not Eligible");
        }
        /* !true ==> not true ==> false
           Will not be executed (printed).
        */

        System.out.println( true == !false ); // true
        System.out.println( !true != false); // false
        System.out.println(!false == true); // true

    }
}
