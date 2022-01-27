package AvengersPractice.day06;

import java.util.Arrays;

public class Question6 {

    public static void main(String [] args) {

        int [] arr = {4,1,0,8,-9,3,4};
        int min = minNum(arr);
        System.out.println("min = " + min); // min = -9
    }

    public static int minNum(int[] nums) {
        Arrays.sort (nums);
        return nums[0];
    }

    }

