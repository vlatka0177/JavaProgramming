package AvengersPractice.day03_Loop;

public class WordIncrementsToWord {

    public static void main(String[] args) {

        /*
        Input: Code
        Output: C-Co-Cod-Code

        Input: Marko
        Output: M-Ma-Mar-Mark-Marko

         */

        String word = "Code";
        //   index     0123

        String c = word.substring(0,1);  // String length
        System.out.println("c = " + c);

        String co = word.substring(0,2);
        System.out.println("co = " + co);
        
        String cod = word.substring(0,3);
        System.out.println("cod = " + cod);
        
        String code = word.substring(0,4);
        System.out.println("code = " + code);

        for (int i = 0; i <= word.length(); i++) {
            String result = word.substring(0,i);
            System.out.println(result);
        }

        System.out.println("-----------------------------------------------------------------------");

        String word2 = "Marko";

        String m = word2.substring(0,1);
        System.out.println("m = " + m);

        String ma = word2.substring(0,2);
        System.out.println("ma = " + ma);

        String mar = word2.substring(0,3);
        System.out.println("mar = " + mar);

        String mark = word2.substring(0,4);
        System.out.println("mark = " + mark);

        String marko = word2.substring(0,5);
        System.out.println("marko = " + marko);

        for (int j = 0; j <= word2.length(); j++) {
            String result2 = word2.substring(0,j);
            System.out.println(result2);
        }

    }
}
