package Assessments.Assessment2_day04OfficeHours;

import java.util.Arrays;

public class Q26 {

    public static void main(String[] args) {

        byte [] m = new byte[5]; // [0, 0, 0, 0, 0]

        for (int j = 0; j < m.length; j++) {
            m[j] = (byte) (m[j] * 2);
        }
        // System.out.println(m);  // hashcode
        System.out.println(Arrays.toString(m));  // [0, 0, 0, 0, 0]

    }
}
