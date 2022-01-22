package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        /*
        1. replace()
        oldValue, newValue
        Returns new string by replacing all the old values with the given new value.
         */
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python");
        // "Python is fun, I love learning Python"

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail"); // JohnSmith@gmail.com
        /* Assign back to variable email to assign the replace method.
        Otherwise, compiler would print the old value.
        */

        System.out.println("email = " + email); // gmail

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python" , "");
        // "Java Java C# C# C++ C++"
        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("  ", " ");
        // takes out the blank space
        System.out.println("sentence2 " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog" , "Cat"); // Assign back to variable s
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");
        /* Only C# that has A space in front of it will be replaced.
           Space C# will be replaced by space Java.
           Remember to assign the value s2. Otherwise, both C# will be printed.
         */

        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("A", "e"); // Jeve
        System.out.println("s3 = " + s3);

       /*
        2. replaceFirst()
        */

        String result = "Java Java Java";
        result = result.replace("Java", "Python"); // "Python Python Python"
        result = result.replaceFirst("Java", "Python"); // "Python Java Java"
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result.replaceFirst("C#", "Java"); // "Java is fun, C# is cool"
        System.out.println(result2);

        String result3 = "Java";
        result3 = result.replaceFirst("a", "o"); // "Jova"
        result3 = result3.replaceFirst("va", "vo"); // "Javo"
        System.out.println(result3);


    }
}
