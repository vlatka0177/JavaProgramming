package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 5;

        switch(number) { // 1, 2, 3, 4, 5, 6, 7

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break; // Exits the switch after executing the case block.

            case 3:
                System.out.println("Wednesday");
                break; // Exits the switch after executing the case block.

            case 4:
                System.out.println("Thursday");
                break; // Exits the switch after executing the case block.

            case 5:
                System.out.println("Friday");
                break; // Exits the switch after executing the case block.

            case 6:
                System.out.println("Saturday");
                break; // Exits the switch after executing the case block.

            case 7:
                System.out.println("Sunday");
                break; /* Exits the switch after executing the case block.
                        If break statement is missing, the next case block is executed. */
            default:   // Only gets executed if none of the case blocks are matching.
                System.out.println("Invalid");
                // No need to give A break statement for the last block of the switch to exit it.

        }

    }
}
