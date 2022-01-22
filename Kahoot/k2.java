package Kahoot;

import java.util.ArrayList;
import java.util.Arrays;

public class k2 {
    public static void main(String[] args) {
        String str = "cybertek";

        for (int i = 0; i <= str.length(); i += 2) {
            System.out.println(str.charAt(i));

/*
            byte[]B = new byte[5];
            for(int j=0; j < B.length; j++) {
                B[j] = (byte) (B[j]) * 2;
            }
            System.out.print(B);
            }
            */

            String [] words = { "one", "two", "three", "four"};
            String [] other = new String[words.length];
            int index =0;

            for(String word: words) {
                other[index++] = word + word.length();
            }
            System.out.println(Arrays.toString(other));
            }


        }
    }


