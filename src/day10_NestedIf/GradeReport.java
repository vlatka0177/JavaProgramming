package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*
        90 ~ 100: Excellent
        80 ~ 89:  Great
        70 ~ 79:  Good
        60 ~ 69:  Passed
        0 ~ 59:   Failed
        */

        int score = 60;

        String result = " "; // To avoid printing multiple statements, and print only the result.

        if(score >= 0 && score <= 100){ // if the score is valid

            if(score >= 90){      // score <= 100 has already been stated in the precondition
            result = "Excellent";
             }else if(score >= 80){  // score < 90 implied. Already checked by the compiler: false result.
            result = "Great";
             }else if(score >= 70){  // score < 80 false. Implied.
            result = "Good";
             }else if(score >= 60) {
            result = "Passed";
             }else{
            result = "Failed";
             }

        }else{                           // if the score is not valid
            result = "Invalid Score";
        }

        System.out.println(result);

        System.out.println("----------------------------------------");

        /* Ternary
        Has limitations.
         */

        int s = 75;

        String result2 = (s >= 0 && s <= 100)? (s >= 98)? "Excellent" :(s >= 80)? "Great" :(s >= 70)? "Good"
                :(s >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result2);

    }
}
