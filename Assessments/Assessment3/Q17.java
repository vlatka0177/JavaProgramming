package Assessments.Assessment3;

import java.util.Scanner;

public class Q17 {

    public static int action() {

        return 0;
    }

    public static int action(int i) {

        return i * 2; // i * 6 = 12
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // true, 6, false, four
        int total = 0;
        total += action(input.nextBoolean()); // total = 10
        total += action(input.nextInt()); // total = 10 + 12 = 22
        total += action(); // total = 22
        total += action(input.next()); // total = 22 + 5 = 27
        total += action(input.next()); // total = 27 + 4 = 31

        System.out.println(total); // 31
    }

    public static int action(String s) {

        return s.length(); // four s.length 4
    }

    public static int action(boolean b) { // true
        if(!b) { // B is not true, so it is false
            return 5;
        } else {
            return 10; // 10
        }
    }
}
