package Assessments.Assessment3;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 5, 7, 3, 8, 20, 14
        int size = input.nextInt();

        int [] a = new int[size];
        int i = 0;

        while (i < size) {
            a [i++] = input.nextInt();
        }
        method8(a); // 7, 3, 14
    }
    public static void method8(int [] arr) {
        for(int n : arr) {
            if(n % 4 == 0) { // 8 % 4 == 0 && 20 % 4 == 0
                continue; // skip
            }
            System.out.println(n);
        }
    }
}
