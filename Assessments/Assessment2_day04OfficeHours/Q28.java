package Assessments.Assessment2_day04OfficeHours;

import java.util.Arrays;

public class Q28 {

    public static void main(String[] args) {

        int [] arr = {1,3,12,5,24,7,9,10};
        boolean [] bArr = new boolean[arr.length];

        for(int i = arr.length - 1; i > -1; i--) {

            if(arr[i] % 2 == 0) {
                bArr[arr.length - 1 - i] = true;
                /*
                10 % 2 == 0 true
                9 false, 7 false
                24 % 2 == 0 true
                5 false
                12 % 2 == 0 true
                3 false, 1 false
                 */
            }
        }
        System.out.print(Arrays.toString(bArr));  // [true, false, false, true, false, true, false, false]

        System.out.println();

    }
}
