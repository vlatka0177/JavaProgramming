package day09_IfStatement;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if(leapYear){
            System.out.println("Year " + year + " is a leap year.");
        }
        if(!leapYear){
            System.out.println("Year " + year + " is NOT a leap year.");
        }

        /*
        Two single if statements. Java Compiler checks all statements one by one,
        even if the first one is true.
         */

        System.out.println("------------------------------------------");

        /*
        If...Else Statement is more efficient.
        It only executes the statement that is true.
         */

        if(leapYear){
            System.out.println("Year " + year + " is a leap year.");
        }else{
            System.out.println("Year " + year + " is not a leap year.");
        }

    }
}
