package day23_CustomMethod_Void;

public class OddNumbers {

    public static void main(String[] args) {

        //1. create a method that can print odd numbers between 1~100 in a same line separated by space.

     oddNumbers();
    }

    public static void oddNumbers(){

        for (int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }

}
