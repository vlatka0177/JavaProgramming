package Kahoot;

public class Replace_ReplaceFirst {

    public static void main(String[] args) {

        String str = "Dog Cat";
        str.replace("Cat", "Dog"); // no assignment to str, so no replacement happens
        System.out.println(str.endsWith("Dog"));
        System.out.println(str);

        str = str.replace("Dog", "tiger");
        System.out.println((str.startsWith("Dog")));
        System.out.println(str);

        System.out.println("-------------------------------------------------");

         int z = 5;
         for(int i = 5; i > 0; i--) {  // 5 4 3 2 1 (15)
         z += i; // z = z + i
         }
        System.out.println(z); // 20

        System.out.println("---------------------------------------------------");




    }

}
