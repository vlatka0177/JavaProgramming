package Assessments.Assessment2_day04OfficeHours;

public class Q18 {

    public static void main(String[] args) {

        String input = "today it will be 100 degrees !"; // input.length() = 30

        //q -> q++ -> ++q -> q -> q++ -> ++q -> q -> q++ -> ++q -> q -> q++ -> ++q -> q == 8
        int q = 0; // 0, 2, 4, 6, 8

        while (q++ < input.length()) {  // 0, 2, 4, 6, 8

            if (q == 8) {
                continue;   // Skip when q == 8
            } else if (q == 9) {
                break;      // Exit the loop if q == 9
            }
            System.out.print(input.charAt(++q));  // (1+1), (3+1), (5+1), (7+1)
            /* charAt(2) = d
               charAt(4) = y
               charAt(6) = i
            */
        }
        System.out.println();

    }
}
