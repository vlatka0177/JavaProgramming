package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        // Interview Question

        String[] group1 = {"Alan", "Lucy", "Ana"}; // 3 elements
        String[] group2 = {"Maria", "Amanda", "Darko",  "Sonja", "Valerie"}; // 5 elements

        String[] students = new String[group1.length + group2.length]; // 8 elements

        int i = 0; // starting from index 0
        for (String each : group1) {  // get all elements from the array1
            students[i++] = each; // each element is assigned to a separate index number
        }                         // without it, each element would be assigned to index 0

        for (String each : group2) {
           students[i++] = each;
        }

        System.out.println(Arrays.toString(students)); // [Alan, Lucy, Ana, Maria, Amanda, Darko, Sonja, Valerie]

        System.out.println("-------------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;
        for (char ch : ch1) {
            chars[j] = ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j] = ch;
            j++;
        }

        System.out.println(Arrays.toString(chars)); // [A, B, C, D, E, F, G, H]

    }
}
