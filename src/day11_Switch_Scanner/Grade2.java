package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {


/*
If the grade is A or B or C or D ====> "Passed'
Otherwise ====> "Failed"
 */

        char ch = 'A';
        String result = "";
        // ||

        switch (ch){

                    case 'A': case 'B': case 'C': case 'D':
                    result = "Passed";
                    break;

                    case 'F':
                    result = "Failed";
                    break;

                    default:
                     result = "Invalid";
        }

        System.out.println(result);
    }
}