package Assessments;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Assessment2 {

    public static void main(String[] args) {

        /*
        QUESTION 1
        String can be made in two ways:

        String str = "abc";
        String str1 = new String();

        String is immutable.
        Concatenating anything to a String will turn everything to a String.


        QUESTION 2
        To return the last index of a String
        str.length()-1;

        String str = "abc"
        Index         012
        String length 123 elements
        */


        // QUESTION 3
        String wrd = "    Winter is coming    ";
        wrd = wrd.trim();  // "Winter is coming"
        System.out.println(wrd.length());  // 16


        // QUESTION 4
        String a = "123";
        String b = 5 + 4 + a;  // 5 + 4 + "123"
        System.out.println(b);  // 9123


        // QUESTION 5
        //         012345678910
        String s = "Java is fun";
        int c = s.charAt(4);  // ' '

        if (c == 'a') {
            System.out.println("A");
        } else if (c == ' ') {
            System.out.println("B");  // B
        } else {
            System.out.println("C");
        }


        // QUESTION 6
        String result = 3425 > (9 * 1000) ? "garden" : "patio";  // 3425 > 9000 is false, so "patio"
        result.substring(2); // Doesn't do anything because result.substring is not assigned to result
        // result = result.substring(2);  // tio

        System.out.println(result);  // patio


        // QUESTION 7
        //  Index    01234567891011121314151617
        String str = "the fox ran under the bridge";

        str = str.substring(4, 17);  // Ending index of substring, 17, is not included.
        str.toUpperCase(); // Doesn't do anything because str.toUpperCase() is not assigned to str
        // str = str.toUpperCase();  // FOX RAN UNDERground

        System.out.println(str + "ground");  // fox ran underground


        // QUESTION 8
        String z = "the game was tied at 2-2";
        String z2 = z.substring(5);  // z2 = "ame was tied at 2-2"

        int index1 = z.indexOf("game");  // int  index1 = 4
        int index2 = z2.indexOf("game");  // int index2 = -1

        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);  // -1
        }


        // QUESTION 9
        //          0123456
        String p = "popcorn";
        // p = p.substring(1,8);  // StringIndexOutOfBoundsException

        p = p.substring(0, 3);  // "pop" Ending index does not get included.

        if (p.equals("opcor")) {
            System.out.println(p.length());
        } else {
            System.out.println(p.replace("o", "a"));  // pap
        }

        String r = "popcorn";
        r = r.substring(1, 6);  // "opcor" Ending index does not get included.

        if (r.equals("opcor")) {
            System.out.println(r.length());  // 5
        } else {
            System.out.println(r.replace("o", "a"));
        }


        // QUESTION 10
        String v = "today I will go to the beach";
        boolean d = v.contains("i");  // true
        boolean e = v.substring(12).startsWith("go");  // false


        String result2 = d && e ? "go" : "don't go";
        System.out.println(result2);  // don't go


        /*
        QUESTION 11
        The continue statement wll only skip the rest of the iteration, but the break statement
        will exit the loop completely.

        Debugging: bug icon in the top right corner, to the right of the green arrow.
        Then press on the left bottom box step over icon
        */


        // QUESTION 12

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;  // skip all even numbers
            }
            System.out.print(i);  // 1 3 5 7 9
        }

        System.out.println();


        // QUESTION 13
        int number = 5;
        while (number < 100) {
            number += number; // number = number + number;
            // number = 5 + 5 = 10
            // number = 10 + 10 = 20
            // number = 20 + 20 = 40
            // number = 40 + 40 = 80
            // number = 80 + 80 = 160
            // 160 > 100, so the loop stops with 80 + 80
        }
        System.out.println(number);  // 160


        // QUESTION 14
        int k = 0;

        do {
            k = k++ + --k - (k % 3);
        } while (++k < 4);

         /*
            k = 0 + (1 - 1) - (0 % 3) = 0     ++k = 1  (1 < 4)
            k = 1 + (2 - 1) - (1 % 3) = 1     ++k = 2  (2 < 4)
            k = 2 + (3 - 1) - (2 % 3) = 2     ++k = 3  (3 < 4)
            k = 3 + (4 - 1) - (3 % 3) = 6     ++k = 7  (7 > 4 )  exits the loop
            */

        System.out.println(k);  // 7

        /*
        smaller n % bigger n = always smaller n itself
        0 % 3 = 0   0 / 3 = 0 with 0 remainder
        1 % 3 = 1   1 / 3 = 0 with 1 remainder
        2 % 3 = 2   2 / 3 = 0 with 2 remainder
        3 % 3 = 0   3 / 3 = 1 with 0 remainder
        4 % 3 = 1   4 / 3 = 1 with 1 remainder
        */


        /* QUESTION 15
        String str3 = "The whole time it was raining";

        do {

          System.out.print(str3.charAt(0));  // T o miw in StringIndexOutOfBoundsException
            str3 = str3.substring(3);

        }while(!str3.isEmpty());


        str = " whole time it was raining."
        str = "ole time it was raining."
        str = " time it was raining."
        str = "me it was raining."
        str = "it was raining."
        str = "was raining."
        str = " raining."
        str = "ining."
        str = "ng." 01
        */


        // QUESTION 16

        String s2 = "I will find the lost book";
        String word2 = ""; // An empty string.
        /*
        for(int index = s2.length()-1; index <= 0;  // Does not execute the for loop
            word2 += s2.charAt(index);
        }
        System.out.println(word2); // No answer text provided. Empty string.
        */

        //To go into the for loop
        for(int index = s2.length()-1; index <= 0; index--) {
            word2 += s2.charAt(index);
        }
        System.out.println(word2); // koob tsol eht dnif lliw I

        // QUESTION 17

        String str4 = "cybertek";
        /*
        for(int m = 0; m <= str4.length(); m += 2) {
            System.out.println(str4.charAt(m)); // cbre StringIndexOutOfBoundsException
        }
        */
        for(int m = 0; m <= str4.length()-1; m += 2) {
            System.out.print(str4.charAt(m)); // cbre
        }

        System.out.println();

        //QUESTION 18

        String input = "today it will be 100 degrees !"; // input.length() = 30

        //q -> q++ -> ++q -> q -> q++ -> ++q -> q -> q++ -> ++q -> q -> q++ -> ++q -> q == 8
        int q = 0; // 0, 2, 4, 6, 8

        while (q++ < input.length()) {  // 0, 2, 4, 6, 8

            if (q == 8) {
                continue;   // Skip when q == 8
            } else if (q == 9) {
                break;      // Exit the loop if q == 9
            }
            System.out.print(input.charAt(++q));  // (1+1), (3+1), (5+1), (7+1)
            /* charAt(2) = d
               charAt(4) = y
               charAt(6) = i
            */
        }
        System.out.println();


        // QUESTION 19

        int num1 = 2;
        int num2 = 6;
        int iterate = 5;

        int total = 0;  // 0, 8, 16, 24

        for(int j = 0; j < iterate; j++) {

            if(j % 3 == 0) continue; // 24 % 3 == 0 -> skip

            total += num1 + num2; /* total = total + num1 + num2
                                                  0 + 2 + 6
                                                  8 + 2 + 6
                                                  16 + 2 + 6        */
        }
        System.out.println(total);  // 24


        // QUESTION 20

        int count = 0;

        for (int g = 0; g < 4; g++) {
            if (g == 3) continue;

            for (int h = g + 1; h < 5; h++) {
                count++;

                if (h == 3) break;
            }
            System.out.println(count);  // 6
        }


        /* QUESTION 21
           The size of an array is fixed.


           QUESTION 22

        Valid array declarations.  */

        char chars [] = new char[26];
        boolean [] bool = {true, true, false, true};
        String s1 [] = new String[4];
        int [] f = {1,2,3};

        /*Not valid array declarations

        double [4] d ={3,4,5,6}  //  [4] not permissible
        byte [] = {4,5,1,4,5};  // variable missing
        short #num [] = new short[10];   // # symbol not permissible              */


        // QUESTION 23

        int [] nums = new int [5];
        int t = 5;

        nums [2] = t--;  // 5
        nums [0] = t * 2;  // 4 * 2 = 8
        nums [4] = --t + (t-9);  // 3 + (3-9) = -3
        nums [1] = nums [2];  // nums [2] = 5
        nums [3] = nums [t-3];  // nums [3-3] = nums[0] = 8

        System.out.println(Arrays.toString(nums));  // [8,5,5,8,-3]


        // QUESTION 24

        double [] doub = new double[4];  // This one is gone when new array is created
        doub [0] = 1.0;
        doub [2] = 42.1;
        doub = new double[4];  // Creating new double array
        doub[1] = 17.2;  // 17.2
        doub[3] = doub.length;  // 4.0

        System.out.println(Arrays.toString(doub));  // [0.0, 17.2, 0.0, 4.0]


       /* QUESTION 25

        String [] strs = {"display","population","meeting","copy","franchise"};
                      Index   0          1           2        3        4
        int a = strs.length;
        int b = strs[5].length(); // There is no index 5

        System.out.println(a + " " + b);  // ArrayIndexOutOfBoundsException         */


       // QUESTION 26

        byte [] m = new byte[5]; // [0, 0, 0, 0, 0]

        for (int j = 0; j < m.length; j++) {
            m[j] = (byte) (m[j] * 2);
        }
        // System.out.println(m);  // hashcode
        System.out.println(Arrays.toString(m));  // [0, 0, 0, 0, 0]


        // QUESTION 27

        String [] words = {"one", "two", "three", "four"};
        String [] other = new String[words.length];
        int index = 0;

        for (String word : words) {
            other[index++] = word + word.length();
            /*     0         one  +     3
                   1         two  +     3
                   2        three +     5
                   3         four +     4                */
        }

        System.out.println(Arrays.toString(other));  // [one3, two3, three5, four4]


        // QUESTION 28

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

        // QUESTION 29
            // Index  0, 1, 2, 3, 4, 5
        int [] nms = {14,1,84,97,1243,46};
        int ttl = 0;

        for(int i = 0; i < nms.length; i++) {  // i = 0

            if(nms[i] % 2 != 0) {
                ttl += 3; // If not divisible by 2, add 3
            }else {
                ttl += 10; // If not, add 10. 14 % 2 = 0, index 0, so 10.
            }
            if(i % 3 == 0) {  // Not nms, but i. 0 % 3 == 0, so -15
                ttl -= 15;
            }
        }
        System.out.println(ttl);  // 9


        // QUESTION 30

        String [] things = {"house", "shed", "slide", "zebra", "park", "garden"};

        for(String st: things) {
            switch(st.charAt(1)) {
                case 'h':
                    System.out.print(1);
                    break;
                case 'a':
                    System.out.print(2);
                case 's':
                    System.out.print(3);
                    break;
                case 'o':
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case 'l':
                    break;
                case 'g':
                    System.out.print(7); // 451452323
            }
        }

    }
}









