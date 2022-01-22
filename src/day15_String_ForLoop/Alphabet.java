package day15_String_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        // A ~ Z ===> 65~90 ASCII Table

        for(int i = 65; i <= 90; i++){  // I: 65 66 67 ... 90
            System.out.print((char) i + " ");
        }

        System.out.println(); // Prints next statement in A new line.

        System.out.println("----------------------------------------------------------------");

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("-----------------------------------------------------------------");

        // A ~ z

        for(char i = 'a'; i <= 'z'; i++) {  // i: A B c d e f ... z
            System.out.print(i + " ");
        }

            System.out.println();

            System.out.println("---------------------------------------------------------------");

            // Z ~ A

            for(char i = 'Z'; i >= 'A'; i--){
                System.out.print(i + " ");
            }

             System.out.println();

             System.out.println("---------------------------------------------------------------");

            // z ~ A

            for(char i = 'z'; i >= 'a'; i--){
                System.out.print(i + " ");
            }

            System.out.println();

            System.out.println("----------------------------------------------------------------");

            // char ch =

            for(int i = 43; i<= 45; i++){  // ASCII Table
                System.out.print((char)i + " ");
            }

        /*
        Print:
        A~Z
        A~z
        Z~A
        z~A
         */
    }
}
