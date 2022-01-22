package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        /*
        4. Create A class called Character Identity.
        Write A program that can identify if the given character is A digit or Alphabetic Character(A~Z or A~Z)
        or A special character
		Input:
			ch = '@'
		Output:
			Special Character
		HINT: You may want to check out the numbers of the characters on ASCII table
        */

        char ch = '@';

        if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }else if((ch >= 'A' && ch <= 'Z')  || (ch >= 'a' && ch <= 'z')){
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special Character");
        }

        // Although braces are optional, it is advisable to always use them to avoid mistakes.
    }
}
