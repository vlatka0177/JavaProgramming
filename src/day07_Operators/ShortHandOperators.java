package day07_Operators;

import java.sql.SQLOutput;

public class ShortHandOperators {

    public static void main(String[] args) {

        //Assignment Operator: x = y

        int number = 100;

        System.out.println("number = " + number); // 100

        number = 200;

        System.out.println("number = " + number); // 200

        System.out.println("----------------------------");

        String word = "Java Programming";

        System.out.println("word = " + word); // word = Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word); // word = Wooden Spoon

        word = "Cydeo";

        System.out.println("word = " + word); // Cydeo

        /*
        The assigned value has to match the data type of the original value.
        If the original data type is int number, only int value can be assigned with assignment operator.
        If the original data type is String word, only String value can be assigned with assignment operator.
         */

        System.out.println("-----------------------------");

        // Addition Assignment Operator  x += y means x = x + y

        int x = 100;

        System.out.println("x = " + x); // 100

        System.out.println(x + 200); // 300

        x = x + 200; // Assignment value
        x += 200; // Addition assignment operator

        System.out.println("x = " + x); // 300

        System.out.println("------------------------------");

        String str = "Wooden";

        str += "Spoon"; // str = str + "Spoon"

        System.out.println("str = " + str); // soutv + enter

        System.out.println("------------------------------");

        double num1 = 2.5;

        System.out.println("num1 = " + num1); // 2.5

        // num1 = num1 + 5.5; Assignment value
        num1 += 5.5; // Addition assignment operator

        System.out.println("num1 = " + num1); // 8.0

        System.out.println("-------------------------------");

        // deposit $300

        double availableBalance = 1000.50;

        System.out.println("Available Balance = " + availableBalance); // 1000.50

        availableBalance += 300; // availableBalance = 1000.50 + 300

        System.out.println("Available Balance = " + availableBalance); // 1300.50

        // Subtraction Assignment Operator x -= y means x = x - y

        // withdraw $500

        availableBalance -= 500; // availableBalance = 1300.50 - 500

        System.out.println("Available Balance = " + availableBalance); // 800.50

        // withdraw $200, then deposit $400

        availableBalance -= 200; // availableBalance = 800.50 - 200

        System.out.println("Available Balance = " + availableBalance); // 600.50

        availableBalance += 400; //availableBalance = 600.50 + 400

        System.out.println("Available Balance = " + availableBalance); //1000.50

        System.out.println("----------------------------------");

        //Multiplication Assignment Operator  x *= y means x = x * y

        double salary = 50000.50;

        System.out.println("salary = " + salary); // 50000.5

        salary *= 2; // salary = salary * 2

        System.out.println("salary = " + salary); // 100001.0

        System.out.println("-------------------------------");

        double dogeCoin = 0.00000001;

        dogeCoin *= 1000000;

        System.out.println("dogeCoin = " + dogeCoin); // 1000000

        System.out.println("--------------------------------");

        // Division Assignment Operator  x /= y means x = x / y

        double num2 = 25000.0;

        System.out.println("num2 = " + num2); // 25000.0

        // num2 = num2 / 2;
        num2 /= 2;

        System.out.println("num2 = " + num2); //

        System.out.println("---------------------------------");

        // Remainder Assignment Operator  x %= y means x = x % y

        double num3 = 100.0;

        num3 %= 3; // num3 % = remainder of num3 / 3 or 100 - (3 * 33)

        System.out.println("num3 = " + num3); // 1

        System.out.println("-------------------------------------");

        int centsAmount = 127;

        System.out.println("Cents Amount = " + centsAmount);

        int quarters = centsAmount / 25;

        int centsRemainder = centsAmount % 25; /* centsRemainder = remainder of centsAmount / 25
                                                  127 - (25 * 5)                              */

        System.out.println("Quarters = " + quarters); // 5

        System.out.println("Cents Remainder = " + centsRemainder); // 2

        System.out.println("--------------------------------------");

        int centsAmount2 = 101;

        centsAmount2 %= 25; // Remainder of centsAmount2 / 25

        System.out.println("Cents Amount 2 = " + centsAmount2); // 1

        System.out.println("--------------------------------------");

        int y = 300;

        y %= 16; /* Remainder of y / 16
                    300 - (16 * 18)      */

        System.out.println("y = " + y); // 12

        System.out.println("----------------------------------------");

        int accountBalance = 3500;

        // insurance fee charged in increments of $153

        accountBalance %= 153;

        System.out.println("Account Balance = " + accountBalance);







    }
}
