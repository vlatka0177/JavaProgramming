package Assessments.Assessment2_day04OfficeHours;

public class Q12 {

    public static void main(String[] args) {

    /*
    Debugging: bug icon in the top right corner, to the right of the green arrow.
    Then press on the left bottom box step over icon.
    */

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;  // skip all even numbers
            }
            System.out.print(i);  // 1 3 5 7 9
        }

        System.out.println();

    }
}
