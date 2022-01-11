package day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        /*
        Return Methods
        - Method can return a value by using a Return Statement. It makes the value reusable with another method.
        - Return statement is used for returning a value from Return Methods and for exiting the method.
        - Return statement can be used to exit not only Return Method, but also other methods, such as Void Method.

                      20      40
        total = sum(value1, value2); ==> Calling a value in Return Method

        public static int sum(int num1, int num2){

        int result;
        result = mum1 + num2;

        return result;
        }
         */

        reverse("Java");

        String str = "Java";
        String result = reverseWord(str);
        System.out.println(result);

        String result2 = reverseWord("Marko");
        System.out.println(result2);

    }
    // CUSTOM METHOD VOID
    public static void reverse(String str){  // "Java"

        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    // CUSTOM METHOD RETURN
    public static String reverseWord(String str){   // Data is reusable with different strings

        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            reverse += str.charAt(i);
        }
        return reverse;  // Return line instead of a print statement
    }


}
