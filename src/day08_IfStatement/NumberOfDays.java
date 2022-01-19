package day08_IfStatement;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5; // Only valid numbers are given: 1 ~ 12

        boolean has28Days = number == 2;
        // for the month that has 28 days

        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        // for the months that have 30 days

        boolean has31Days = !has28Days && !has30Days;
        // if the month does not have 28 days and does not have 30 days

        if(has28Days){                      // If the month has 28 days
            System.out.println("28 days");
        }

        if(has30Days){                      // If the month has 30 days
            System.out.println("30 days");
        }

        if(has31Days){                      // If the month has 31 days
            System.out.println("31 days"); // 31 days
        }

    }
}

/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that have 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that have 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */