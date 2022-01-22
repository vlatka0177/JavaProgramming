package day24_CustomMethod_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

        monthName(12);

    }

    // 3. Create A method that can display the name of the month based on the given number to the method.

    public static void monthName(int number) {

          /* With the pre-condition, it is possible to use : invalid (else invalid) at the end of the ternary,
            but nested if is the preferred solution with A pre-condition.  */

        String name = " ";

        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return;  /* Exits monthName Method, although it is A Void Method.
                        The remaining code fragment never gets executed.
                        Exits only the current method, and not any other. Main method continues running.
            System.exit(0)              Terminates every method in the entire system. */
        } else {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ?
                    "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ?
                    "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November"
                    : "December";

            System.out.println("Month name = " + name);
        }

    }


}
