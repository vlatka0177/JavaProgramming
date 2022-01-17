package Assessments.Assessment2_day04OfficeHours;

public class Q14 {

    public static void main(String[] args) {

        int k = 0;

        do {
            k = k++ + --k - (k % 3);
        } while (++k < 4);

         /*
            k = 0 + (1 - 1) - (0 % 3) = 0     ++k = 1  (1 < 4)
            k = 1 + (2 - 1) - (1 % 3) = 1     ++k = 2  (2 < 4)
            k = 2 + (3 - 1) - (2 % 3) = 2     ++k = 3  (3 < 4)
            k = 3 + (4 - 1) - (3 % 3) = 6     ++k = 7  (7 > 4 )  exits the loop
            */

        System.out.println(k);  // 7

        /*
        smaller n % bigger n = always smaller n itself
        0 % 3 = 0   0 / 3 = 0 with 0 remainder
        1 % 3 = 1   1 / 3 = 0 with 1 remainder
        2 % 3 = 2   2 / 3 = 0 with 2 remainder
        3 % 3 = 0   3 / 3 = 1 with 0 remainder
        4 % 3 = 1   4 / 3 = 1 with 1 remainder
        */

    }
}
