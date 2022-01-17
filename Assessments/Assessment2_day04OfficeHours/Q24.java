package Assessments.Assessment2_day04OfficeHours;

import java.util.Arrays;

public class Q24 {

    public static void main(String[] args) {

        double [] doub = new double[4];  // This one is gone when new array is created
        doub [0] = 1.0;
        doub [2] = 42.1;
        doub = new double[4];  // Creating new double array
        doub[1] = 17.2;  // 17.2
        doub[3] = doub.length;  // 4.0

        System.out.println(Arrays.toString(doub));  // [0.0, 17.2, 0.0, 4.0]

    }
}
