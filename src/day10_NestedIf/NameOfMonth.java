package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 10;

        String result = " ";
        /* Give a variable some temporary value, such as an empty string " ".
           This allows for the variable to be initiated.
           The temporary value will be replaced by the result, once found.
           Allows for only one print statement that contains the result.
           Avoids printing a statement after every if statement. */

        if(number >=1 && number <= 12) {  /* if the number is valid (1~12)
        Click on the - on the line to the left of the pre-condition statement to condense.

         If there is only one print statement in the if block, curly braces can be omitted.
         Although it could be done, it is not advised to do it.
         For multiple print statements under one if condition, curly braces are obligatory.*/

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

        }else {  // if the number is not valid
            result = "Invalid";
        }

        System.out.println(result);

    }

}
