package day23_CustomMethod_Void;

public class EvenNumbers {

    public static void main(String[] args) {

        // 2. Create A method that can print even numbers between 1~100 in A same line separated by space.

    evenNumbers();;

    }

    public static void evenNumbers(){

        for (int i = 2; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }


}

