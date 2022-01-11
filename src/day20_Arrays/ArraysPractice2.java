package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letters[2] = 'C';

        Use the loop to avoid assigning a character 26 times.
        With each repetition, the character and the index number are changing.

        for(int i = 0, j = 'A'; i < letters.length; i++, j++){ // i: index number 0 ~ last index
            letters[i] = (char)j;
        }
         */

        char ch = 'A';
        for(int i = 0; i < letters.length; i++, ch++){
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));
        // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

    }
}
