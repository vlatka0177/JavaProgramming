package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        /* Write A program that can get the domain of the email.
        Ex:
        email = Cydeo.School@gmail.com
        output: gmail

        email = Cydeo.School@yahoo.com
        output: yahoo
         */

        String email = "vlatka.persin@gmail.com";

        String domain = email.substring(email.indexOf("@") + 1 , email.lastIndexOf("."));
        // Ending index does not include that index "." Prints the index before the ending index.
        System.out.println(domain);

        System.out.println("----------------------------------");

        String str1 = "Java is fun, Java is cool. I love Java.";

        int beg = str1.indexOf(" J");
        int end = str1.lastIndexOf(".");
        String s2 = str1.substring(beg, end); // "Java is cool."

        System.out.println(str1);
        System.out.println(s2);
    }
}
