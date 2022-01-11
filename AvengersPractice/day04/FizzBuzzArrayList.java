package AvengersPractice.day04;

import java.util.ArrayList;

public class FizzBuzzArrayList {

    /*
    Write a program that returns a list of strings between two numbers.
    For multiples of 3 insert "Fizz" instead of a number.
    For multiples of 5 insert "Buzz" instead of a number.
    For multiples of 3 and 5 insert "FizzBuzz" instead of a number.

    You will need to create a divisibleBy method that accepts two integer numbers and returns a Boolean.

    Input: fizzBuzzGenerator(1,15);
    Output: ["1", "2", "Fizz", "4", "Buzz", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "FizzBuzz"]
    */

    public static void main(String[] args) {

        ArrayList<String>fizBuzz = fizzBuzzGenerator(3,15);
        System.out.println("fizBuzz = " + fizBuzz);
        // fizBuzz = [Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
    }

    private static boolean divisibleBy(int num1, int num2) {
        return num1 % num2 == 0;
    }

    private static ArrayList<String>fizzBuzzGenerator(int first, int end) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = first; i <= end; i++) {
            if (divisibleBy(i, 15)) {
                result.add("FizzBuzz");
            } else if (divisibleBy(i, 3)) {
                result.add("Fizz");
            }else if(divisibleBy(i,5)){
                result.add("Buzz");
        }else {
                result.add(i+"");
        }
    }
        return result;
    }
}
