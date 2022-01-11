package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
        The only time when an additional nextLine method has to be inserted is when
        the nextLine method is used after any method other than nextLine method.
         */

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); // Vlatka Persin Enter

        System.out.println("Enter your building number:");
        String buildingNumber = scan.next(); // 14101 Enter

        scan.nextLine(); // Clears Enter from the memory that was left from next() method

        System.out.println("Enter your street name:");
        String street = scan.nextLine(); // Stanwood Terrace Enter

        System.out.println("Enter your city name:");
        String city = scan.nextLine(); // North Potomac Enter

        System.out.println("Enter your state:");
        String state = scan.next(); // MD Enter

        System.out.println("Enter your zip code:");
        String zipCode = scan.next(); // 20850 Enter

        scan.nextLine(); // Clears Enter from the memory that was left from next() method.

        System.out.println("Enter your country:");
        String country = scan.nextLine(); // United States of America

        scan.close();





    }
}

/*
1. Enter your full name. ( nextLIne() )
2. Enter your building number. ( next() )
3. Enter your street name. ( nextLine() )
4. Enter your city name. ( nextLine() )
5. Enter your state. ( next() )
6. Enter your zip code. (next() )

Display the shipping address.
 */


