package Assessments.Assessment3;

public class Q8 {

    public static void main(String[] args) {

        method2("The sun set quickly and created A shadow.");
        // The sun set quickly and created A shadow.

        method3("The sun set quickly and created A shadow.");
        // t quickly and created A shadow.
    }

    public static void method2(String s) {

        String a = s.substring(10);

        if(a.length() > s.length()) {
            System.out.print(a);
        } else {
            System.out.println(s); // The sun set quickly and created A shadow.
        }
    }

    public static void method3(String str) {

        String a = str.substring(10);

        if(a.length() > str.length()) {
            System.out.print(str);
        } else {
            System.out.println(a);  // t quickly and created A shadow.
        }
    }
}
