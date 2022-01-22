package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = ""; // 1 2 3 4 5
        String letters = ""; // CydeoSchoolWoodenSpoon
        String specialChars = ""; //!@#$%

        for (int i = 0; i < str.length(); i++) {
            /*
            Initialization is the starting point of the loop. Here i=0. (Starting index number.)

            Two options for A condition:
            i < str.length() or i <= str.length()-1
            length() method counts the number of characters, not their index position.
            Index starts with 0. length() starts with 1.
            In Condition, i: index numbers of str, 0 ~ last index number, here 0 ~ 7
             */

            char ch = str.charAt(i); // ch: each character that we have in str

            if (ch >= '0' && ch <= '9') { // if the character is between '0' and '9', it's A digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // if the character is between 'A' and 'Z' it's A letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') { // if the character is between 'A' and 'z' it's A letter
                letters += ch;
            } else {
                if(ch != ' ') { // if the special character is not A space
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
