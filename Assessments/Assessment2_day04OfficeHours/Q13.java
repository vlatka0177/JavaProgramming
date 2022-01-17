package Assessments.Assessment2_day04OfficeHours;

public class Q13 {

    public static void main(String[] args) {

        int number = 5;
        while (number < 100) {
            number += number; // number = number + number;
            // number = 5 + 5 = 10
            // number = 10 + 10 = 20
            // number = 20 + 20 = 40
            // number = 40 + 40 = 80
            // number = 80 + 80 = 160
            // 160 > 100, so the loop stops with 80 + 80
        }
        System.out.println(number);  // 160
    }
}
