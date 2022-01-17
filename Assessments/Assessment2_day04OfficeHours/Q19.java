package Assessments.Assessment2_day04OfficeHours;

public class Q19 {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 6;
        int iterate = 5;

        int total = 0;  // 0, 8, 16, 24

        for(int j = 0; j < iterate; j++) {

            if(j % 3 == 0) continue; // 24 % 3 == 0 -> skip

            total += num1 + num2; /* total = total + num1 + num2
                                                  0 + 2 + 6
                                                  8 + 2 + 6
                                                  16 + 2 + 6        */
        }
        System.out.println(total);  // 24
    }
}
