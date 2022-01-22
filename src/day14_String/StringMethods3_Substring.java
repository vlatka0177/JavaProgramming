package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        /*
        1. substring()
        substring(beginning index, ending index)
        Creates substring starting from the given beginning index until the ending index.
        (Ending index is excluded.)
        A small portion of the string

        substring(beginning Index)
        Creates substring starting from the given beginning index till the end of the string
         */

        String word = "Cydeo School";
        // Index:      01234567891011  Space has index number

        String brand = word.substring(0, 4+1); // ==> Cydeo
        System.out.println(brand);
        /* Ending index does not include that index, unless +1 is stated.
        Otherwise, ends at the index before the ending index.
         */

        String str1 = word.substring(6);
        /* By default, string starts from index 6 to the end of the string.
        There is no need to give the ending string if the string is to be printed to the end.
         */

        String word2 = "Java Programming Language"; // Change to "Python C# Ruby" Same substring works

        String s1 = word2.substring(0, word2.indexOf(" ")); // "Java"
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" ")); // "Programming"
        String s3 = word2.substring(word2.lastIndexOf(" ")+1); // "Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
