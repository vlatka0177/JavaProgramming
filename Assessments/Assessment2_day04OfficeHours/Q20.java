package Assessments.Assessment2_day04OfficeHours;

public class Q20 {

    public static void main(String[] args) {

        int count = 0;

        for (int g = 0; g < 4; g++) {
            if (g == 3) continue;

            for (int h = g + 1; h < 5; h++) {
                count++;

                if (h == 3) break;
            }
            System.out.println(count);  // 6
        }
    }
}
