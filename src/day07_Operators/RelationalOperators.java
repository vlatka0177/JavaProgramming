package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        /* All relational operators return Boolean value (true or false).
        >  greater than
        >= greater or equal than
        <  lesser than
        <= lesser or equal than
        == equal (Single equal operator, =, assigns A value to A specific variable)
        != not equal
         */

        boolean result1 = 20 > 40; // false

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // true

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // false

        System.out.println("result4 = " + result4);

        // credit score of 720

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // If the credit score is 720 or greater, then true.

        boolean result5 = 100 < 120; //true

        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; //false

        System.out.println("result6 = " + result6);

        int score = 75;

        boolean hasFailed = score <= 59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);

        System.out.println("------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y; // 100 is not equal to 200

        System.out.println("equal = " + equal); // false

        boolean result8 = "Muhtar" == "Good Guy"; // false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; // false (Char characters ' ')

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; /* true (Strimg characters " ")

        Two values have to be exactly equal.
        "Java" and "Java   " are not equal.
        "Hello World" and "hello world" are not equal. */

        System.out.println("result10 = " + result10);

        System.out.println("------------------------------");

        boolean result11 = 100 != 200.5; // 100 and 200.5 are not equal.

        System.out.println("result11 = " + result11); //true

        boolean result12 = "Java" != "Break"; // Java and Break are not equal.

        System.out.println("result12 = " + result12); // true

        boolean result13 = 300 != 300;

        System.out.println("result13 = " + result13); // false



    }
}
