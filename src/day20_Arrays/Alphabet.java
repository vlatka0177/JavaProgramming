package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        // Create a variable that can contain 26 characters in separate indexes in the array.

        char[] alphabets = new char[26]; // Mandatory to set the length. Z ~ A

        /* Solution without a loop:
                  i    ch   ASCII Table
        alphabets[0] = 'Z'; // 90
        alphabets[1] = 'Y'; // 89
        alphabets[2] = 'X'; // 88
         */

        // Loop Solution 1
        char ch = 'Z';
        for(int i = 0; i < alphabets.length; i++, ch--){
            alphabets[i] = ch;
        }

        /* Loop Solution 2
        for(char i = 0, j = 'Z'; i < alphabets.length; i++, j--){
        alphabets[i] = j;
        }

        System.out.println(alphabets); // Hashcode. Cannot directly pass the name of the variable to print. */

        System.out.println(Arrays.toString(alphabets));
        /* [Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]

        System.out.println(alphabets[0]);  Prints an element of an array */

    }

}
