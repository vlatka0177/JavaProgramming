package Assessments.Assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q26 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // 6, 4, 1, 8, -42, 2, 10
        ArrayList<Integer> nums = new ArrayList<>();

        int run = in.nextInt(); // 6

        while (run > 0) { // 6 true - go inside, assign it once
            run--;
            switch (in.nextInt()) {
                case 1:  // [1 50]
                    nums.add(1);
                case 5:
                    nums.add(50);
                    break;
                case 4: // 4 break []
                    break;
                case 8: // [50]
                    nums.remove(0);
                    break;
                case 10:
                case -1:
                case -42:
                    nums.add(1, 0); //[50 0]
                    break;
                case 55:
                    nums.add(105);
                    break;
                case 2:
                    nums.add(20_000); // [50 0 0 20000]
                    break;
                default:
                    nums.add(null);
            }
        }
        System.out.println(nums); // [50, 0, 0, 20000]
    }
}
