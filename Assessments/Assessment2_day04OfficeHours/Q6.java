package Assessments.Assessment2_day04OfficeHours;

public class Q6 {

    public static void main(String[] args) {

        String result = 3425 > (9 * 1000) ? "garden" : "patio";  // 3425 > 9000 is false, so "patio"
        result.substring(2); // Doesn't do anything because result.substring is not assigned to result
        // result = result.substring(2);  // tio

        System.out.println(result);  // patio
    }
}
