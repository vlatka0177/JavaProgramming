package OfficeHours.day03_LoopsArrays;

public class CompareLoops {

    public static void main(String[] args) {

        int num = 10;

        for (int i = num; i > 5; i--) {
            System.out.println("Hello batch-25. For Loop");
        }

        while(num < 5) {
            System.out.println("Hello Batch-25. While Loop");
        }

        System.out.println("----------------------------------------------------------");

        do {
            System.out.println("Hello Batch-25. Do-while Loop"); // Executes once, even if the condition is not met.
        }while(num < 5);


    }
}
