package day10_NestedIf;

public class NameOfMonths2 {

    public static void main(String[] args) {

        int number = 8;
        String result = " ";

        if(number == 1) {
            result = "January";
        }else if(number == 2){
            result = "February";
        }else if(number == 3){
            result = "March";
        }else if(number == 4){
            result = "April";
        }else if(number == 5){
            result = "May";
        }else if(number == 6){
            result = "June";
        }else if(number == 7){
            result = "July";
        }else if(number == 8){
            result = "August";
        }else if(number == 9){
            result = "September";
        }else if(number == 10){
            result = "October";
        }else if(number == 11){
            result = "November";
        }else {
            result = "December";
        }

        /*
        One If          (n == 1)? "Jan"
        10 Else If      :(n == 2)? "Feb"
        One Else
         */

        int n = 4;

        String name = (n == 1)? "January" :(n == 2)? "February" :(n == 3)? "March" :(n == 4)? "April"
                :(n == 5)? "May" :(n == 6)? "June" :(n == 7)? "July" :(n == 8)? "August"
                :(n == 9)? "September" :(n == 10)? "October" :(n == 11)? "November" : "December";

        System.out.println(name);

        /*
        Parenthesis are not required. They make the string more readable. Thus, preferred.
         */
    }
}
