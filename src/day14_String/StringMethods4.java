package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        String str = "Cydeo";
        String str2 = str.repeat(4); // "CydeoCydeoCydeoCydeo"
        System.out.println(str2);

        String s1 = "Wooden Spoon "; // Wooden Spoon Wooden Spoon
        String s2 = s1.repeat(10);
        System.out.println(s2);

        System.out.println( "IVAN\n".repeat(5));

        String name = "Java";
        System.out.println((name +" ").repeat(5)); // concate +" " to get space

    }
}
