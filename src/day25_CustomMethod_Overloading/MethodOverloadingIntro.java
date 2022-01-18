package day25_CustomMethod_Overloading;

import day20_Arrays.ArraysIntro;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        /*
        Method Overloading
        - allows us to have more than one method with the same name
        - parameters must be different (either the data type or the number of parameters)
        - Return Type can be same or different
        - Any method can be overloaded, including Main Method
        - Method can be overloaded a number of times

         Advantage:
        1. easy to memorize
        2. easy to read
        3. reusable
        4. flexible

        Without Method Overload: three different methods with three different names

        public static int sumOfTwoNumbers(int a, int b){
        return a + b;
        }

        public static int sumOfThreeNumbers(int a, int b + int c){
        return a + b + c;
        }

        public static int sumOfFourNumbers(int a, int b + int c + int d){
        return a + b + c + d;
        }

        Multiple Methods with Method Overloading: three different methods with the same name

        public static int sum(int a, int b){
        return a + b;
        }

        public static int sum(int a, int b, int c){
        return a + b + c;
        }

        public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
        }

    Task
     1. Create a method that can find the sum of two numbers
	 2. Create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	 3. Create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
         */

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("---------------------------------------------------------------------");

        int sum1 = sumOfNumbers(10, 20);

        int sum2 = sumOfNumbers(10, 20, 30);

        int sum3 = sumOfNumbers(10, 20, 30, 40);

        double sum4 = sumOfNumbers(18.2, 30.7);

        double sum5 = sumOfNumbers(3.5, 7.2, 8.9);

        double sum6 = sumOfNumbers(4.5, 6.3, 8.2, 3.7);

    }

    public static int sumOfNumbers(int num1, int num2){

        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {

        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){

        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {

        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4; // return sumOfNumbers(num1, num2, num3) + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return num1 + num2 + num3 + num4;
    }

}
