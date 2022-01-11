package OfficeHours.day06_CustomMethods;

public class PrimeNumber {

    /*
    Write a method that can check if a number is a prime number.
    Prime numbers are numbers that are greater than 1 and divisible only by 1 and themselves.

    13 / 1, 13 prime
    10 / 1, 2, 5, 10  not prime
    9 / 1, 3, 9 not prime
    7 / 1, 7 prime                                                                      */

    public static void main(String[] args) {

        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(7)); // true
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(13)); // true
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(23)); // true

        for(int i = 0; i <= 100; i++) {
            if(isPrime(i)){
                System.out.print(i + " "); // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
            }
        }
    }

    public static boolean isPrime(int number) {

        if(number < 2) {
            return false;
        }

        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
