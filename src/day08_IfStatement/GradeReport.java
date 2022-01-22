package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        // Multiple Single If Statements

        int score = 85; // 0 ~ 100

        boolean a = score >= 90 && score <= 100; /* false
        && used to define A range.
        If one boolean expression is false, the result is false. */

        boolean b = score >= 80 && score <= 89; // true
        /* boolean B = score >= 80 && !A;
        If score is not A, but is greater than 80.
         */

        boolean c = !a && !b && score >= 70;  // false
        /* If score is not A and not B and is greater than 70.
        boolean c = score >= 70 && score <= 79;
        */

        boolean d = score >= 60 && score <= 69; // false

        boolean f = score >= 0 && score <= 59; // false
        // boolean f + !A && !B && !c && !d;

        if(a) {                                 // if the student made an A
            System.out.println("Excellent");
        }

        if(b) {                                 // if the student made A B
            System.out.println("Great");
        }

        if(c){                                  // if the student made A c
            System.out.println("Good");
        }

        if(d){                                  // if the student made A d
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