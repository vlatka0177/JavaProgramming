package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {


        /*
        1. trim()
         */
        String str1 = "     batch 25     ";
        /* trim() method creates new string without white spaces.
        White spaces are unused spaces before and after the text.
        Only the spaces not separating the characters will be removed.
        "batch     25" is not A white space, and would not be removed.*/

        str1 = str1.trim();
        /* "batch 25"
        Assign back to str1 */

        System.out.println(str1);

        /*
        2. indexOf()
        */
        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h"); // 8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); // 9
        System.out.println("n2 = " + n2);

        // The first o gives the first o character.
        // Need to make subsequent o unique by adding more characters to it. ool

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("A"); // 1
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("an"); // 18
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("gua"); // 20
        System.out.println("n5 = " + n5);

        /*
        3. lastIndexOf()
        */
        int n6 = str3.lastIndexOf("g");
        System.out.println("n6 = " + n6);  // 23

        System.out.println("-----------------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("A"); // first A from the left
        int lastA = s.lastIndexOf("A"); // last A or first A from the right
        int secondA = s.indexOf("A "); // make it unique
        int thirdA = s.indexOf("A C");
        int fourthA = s.indexOf("ava W");
        int fourth_A = s.lastIndexOf("av"); // first A in av from the right
        int fourthA_ = s.indexOf("Ca") + 1; //index number of the character after C
        int fifthA = s.lastIndexOf("va") + 1;
        //index number of the character after v in the first va from the right
        int fifth_A = s.lastIndexOf("A W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.indexOf("A o");
        int seventh_A = s.lastIndexOf("A ");


        System.out.println("fistA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fourth_A = " + fourth_A);

    }
}
