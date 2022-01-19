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

        int score = 58;

        // Solution 1

        if(score >= 0 && score <= 100){ // if the score is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if(score>= 90 ){ //false:  score < 90
                System.out.println("Excellent");
            }else if(score >= 80 ){ // false: score < 80
                System.out.println("Great");
            }else if(score >= 70){ // false: score < 70
                System.out.println("Good");
            }else if(score >= 60){// false: score < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the score is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("---------------------------------------------------------------------");

        // Solution 2

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

        System.out.println("------------------------------------------------------------------------");

        // Solution 3: Ternary

        int s = 85;

        String result2 = (s >= 0 && s <= 100)? (s >= 90)? "Excellent" :(s >= 80)? "Great" :(s >= 70)? "Good"
                :(s >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result2);

        System.out.println("-------------------------------------------------------------------------");

        // Solution 4:

        String result3 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )
            result3 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result3 = "Invalid Score";
        }

        System.out.println(result3);


    }
}
