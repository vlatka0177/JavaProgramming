package day15_String_ForLoop;

public class StringMethods5 {

    public static void main(String[] args) {

        // isEmpty()

        String str = " ";

        boolean r = str.isEmpty();

        System.out.println(r); // false

        // It is not empty because it contains white space, which is A character.

        System.out.println("-----------------------------------------------------");

        // isBlank()

        boolean r1 = str.isBlank();

        System.out.println(r1); // true

        // It is blank because it contains only white space in the string.

        String str2 = "Cydeo    ";

        System.out.println(str2.isBlank()); // false
        // Contains other characters in addition to white space.

        System.out.println("-------------------------------------------------------");

        // equalsIgnoreCase()

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); // false
        // equals() does not ignore case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        // equalsIgnoreCase() ignores case sensitivity.

        System.out.println("-------------------------------------------------------");

        // contains()

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");
        /* Does not ignore case sensitivity. Only "java' and "Java' return as true.
           jAvA returns as false. */

        System.out.println(hasCSharp); // false
        // Compares whether the sentence contains C#
        System.out.println(hasJava); // true
        System.out.println(hasJava2); // false
        System.out.println(hasJava3); // true

        System.out.println("-------------------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.contains("Java")); // false
        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("------------------------------------------");

        // startsWith()

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");

        System.out.println(x); // true

        // endsWith()

        boolean y = a.endsWith("Spoon");

        System.out.println(y); // true

        boolean z = a.toLowerCase().startsWith("wooden");

        /* To ignore case sensitivity, create the lower case/upper case version of string,
        and then compare it with the lower case/upper case in the method.
         */

    }
}
