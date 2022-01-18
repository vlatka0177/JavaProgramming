package AvengersPractice.day01;

import java.util.Locale;

public class StringExample1 {

    public static void main(String[] args) {

        // Input: Hello   Output: HE

        String str = "Hello";
        str = str.toUpperCase();
        System.out.println("str = " + str.substring(0,2));
        // Ending substring index does not include that index, but ends with the previous index.

        System.out.println("----------------------------------------------------------------");

        String st = "Hello";
        st = st.toUpperCase();
        String s = "" + st.charAt(0) + st.charAt(1);
        System.out.println("s = " + s);


    }
}
