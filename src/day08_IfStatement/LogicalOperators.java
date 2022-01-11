package day08_IfStatement;

public class LogicalOperators {

    public static void main(String[] args) {

        /*
        &&    Logical AND (BOTH)
        ||    Logical EITHER (OR)
        !     Logical NOT
         */

        // && Logical AND (BOTH)

        String name = "Vlatka";
        int age = 56;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        /*                    56 >= 18 &&   "USA" == "USA"   true
                              true     &&    true  ======>   true

                              56 >= 18 &&    "UK" == "USA"   false
                              true     &&    false  =====>   false

                              16 >= 18 &&   "USA" == "USA"   false
                              false    &&    true   =====>   false
        If one expression fails, both fail.
         */

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 = creditScore >= 700 && age >= 21;
        /*                            720 >= 700 &&  23 >= 21;   true
                                      true       &&  true  ====> true

                                      650 >= 700 &&  23 >= 21;   false
                                      false      &&  true  ====> false
         */

        System.out.println(name2 + " is eligible for a loan: " + isEligible2);

        // || Logical EITHER/OR

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        /*                      21 >= 18 && ( 'F'   == 'M' ||   'F'  == 'F');
                                true     && (  false       ||   true       )  true
                                true     &&     true       ========>  true
         */


    }
}
