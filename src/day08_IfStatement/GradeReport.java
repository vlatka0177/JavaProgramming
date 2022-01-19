package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        // Multiple Single If Statements

        int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <= 100; /* false
        && used to define a range.
        If one boolean expression is false, the result is false. */

        boolean b = score >= 80 && score <= 89; // true
        /* boolean b = score >= 80 && !a;
        If score is not a, but is greater than 80.
         */

        boolean c = !a && !b && score >= 70;  // false
        /* If score is not a and not b and is greater than 70.
        boolean c = score >= 70 && score <= 79;
        */

        boolean d = score >= 60 && score <= 69; // false

        boolean f = score >= 0 && score <= 59; // false
        // boolean f + !a && !b && !c && !d;

        if(a) {                                 // if the student made an a
            System.out.println("Excellent");
        }

        if(b) {                                 // if the student made a b
            System.out.println("Great");
        }

        if(c){                                  // if the student made a c
            System.out.println("Good");
        }

        if(d){                                  // if the student made a d
            System.out.println("Pass");
        }

        if(f){                                  // if the student made an f
            System.out.println("Fail");
        }
    }
}

/*
Score:
90 ~ 100 ===> Excellent
80 ~ 89  ===> Great
70 ~ 79  ===> Good
60 ~ 69  ===> Passed
50 ~ 59  ===> Failed
 */