package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Wooden", "Spoon"); // W.S.

        System.out.println("--------------------------------------");

        domain("vlatka.persin@gmail.com");

        System.out.println("---------------------------------------");

        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "muhtar@cydeo.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------------------");

        monthName(2);

        System.out.println("-----------------------------------------");

        nameOfDay(4);
    }


    // 1. Create a method that can display the initials of a person.

    public static void initials(String firstName, String lastName){
        
        String initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";

        initials = initials.toUpperCase();

        System.out.println("initials = " + initials);
    }


    // 2. Create a method that can display the domain of an email

    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);
    }

    /* Void method executes the function, but it cannot return a specific value (data) to make it reusable.

     3. Create a method that can display the name of the month based on the given number to the method. */

    public static void monthName(int number){

          /* With the pre-condition, it is possible to state it in a ternary with else invalid : invalid
             at the end of the ternary,  but nested if is the preferred solution for a pre-condition.  */

        String name = " ";

        if(number >= 1 && number <= 12){

            name = (number == 1)?"January" :(number == 2)?"February" :(number == 3)?"March" :(number == 4)?"April"
                    :(number == 5)?"May" :(number == 6)?"June" :(number == 7)?"July" :(number == 8)?"August"
                    :(number == 9)?"September" :(number == 10)?"October" :(number == 11)?"November"
                    :"December";    // Ternary ends with : December (no need to specify the variable number).

        }else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){

        String dayName = " ";

        if(number >=1 && number <=7){

            dayName = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wednesday" :(number == 4)?
                    "Thursday" : (number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday";

        }else{
            dayName = "Invalid";
        }
        System.out.println("Day name = " + dayName);
    }


}

