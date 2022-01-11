package day23_CustomMethod_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("--------------------------------------------------------------");

        helloCydeo5Times();

        System.out.println("--------------------------------------------------------------");

        evenNumbers();

    }

    // Create a function that can print hello world 5 times ==> helloWorld5Times()

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    /* Press minimize button, -, to the left to minimize the method
       Press maximize button, +, to expand the method

       Create a function that can print hello Cydeo 5 times ==> helloCydeo5Times */

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    /* Method needs to have a code fragment to perform
       Create a function that can print all the even numbers from 1 ~ 10 ==> evenNumbers */

    public static void evenNumbers(){

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }

    }


}

