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

        System.out.println("-----------------------------------------------------");

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

        System.out.println("-------------------------------------------------------");

        // || Logical EITHER/OR

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        /*                      21 >= 18 && ( 'F'   == 'M' ||   'F'  == 'F');
                                true     && (  false       ||   true       ) ======> true
                                true     &&     true       ========>  true
                                true
        */
        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("-------------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 =  countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                       true

        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);

        System.out.println("----------------------------------------------------------------");

        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 =  gpa >= 3.5 || familyIncome <= 60000;
        //                      false || true

        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("-----------------------------------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }
}
