package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {

        /*
        7. Interview question.
           Write A program that can reverse any given string.

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */

        String str = "Wooden Spoon";
        // index:     0123456789...

        String result = " "; // Contains the reversed version of str: noopS nedooW
        /*
        result += str.charAt(11); // n
        result += str.charAt(10); // o
        result += str.charAt(9);  // o
        result += str.charAt(8);  // p
        result += str.charAt(7);  // S
        result += str.charAt(6);  // ' '
        result += str.charAt(5);  // n
        result += str.charAt(4);  // e
        result += str.charAt(3);  // d
        result += str.charAt(2);  // o
        result += str.charAt(1);  // o
        result += str.charAt(0);  // W

        Another way is to create A loop. Before creating any loop, analyze.
        */
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        /* (initialization; condition; iteration)
            Without iteration, i always = 11, which is always >= 0. Thus, infinite loop.

            With i = str.length()-1; i is index number of str, starting from last index to index 0.
            length() method counts the number of characters, not their index position.
            The end of A string is always length()-1 because the indexes start at 0, but length starts at 1.

            result += Concatenation: adds each character to result.
            Without +, the character is not going to be added to the string.
        */
        System.out.println(result);



    }
}
