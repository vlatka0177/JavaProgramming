package Assessments.Assessment3;

import java.util.Scanner;

public class Q15 {

    public static String method9(String one, String two, String three) {

        return "" + middle(one) + middle(two) + middle(three);
    }     //           w             l              v

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // lawn, solar, activity
        String str = method9(scan.next(), scan.next(), scan.next());

        System.out.println(str); //wlv
    }
    public static char middle(String s) {
        return s.charAt(s.length()/2); // 4/2 = 2  5/2 = 2  8/2 = 4
    }
}
