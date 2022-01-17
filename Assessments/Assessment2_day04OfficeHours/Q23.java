package Assessments.Assessment2_day04OfficeHours;

import java.util.Arrays;

public class Q23 {

    public static void main(String[] args) {

        int [] nums = new int [5];
        int t = 5;

        nums [2] = t--;  // 5
        nums [0] = t * 2;  // 4 * 2 = 8
        nums [4] = --t + (t-9);  // 3 + (3-9) = -3
        nums [1] = nums [2];  // nums [2] = 5
        nums [3] = nums [t-3];  // nums [3-3] = nums[0] = 8

        System.out.println(Arrays.toString(nums));  // [8,5,5,8,-3]

    }
}
