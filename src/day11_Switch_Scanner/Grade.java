package day11_Switch_Scanner;

import com.sun.tools.javac.Main;

public class Grade {

    public static void main(String[] args) {

        /*
        3. A char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
         */
        char ch = 'B'; // ==

        String result = "";

        switch(ch){
            case 'A':
                result = "Excellent";
                break;

            case 'B':
                result = "Great Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
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
