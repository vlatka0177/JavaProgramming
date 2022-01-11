package day15_String_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        // 15 16 17 18 ... 45

        for(int i = 15; i <= 45; i++){ // i: 15 16 17 18 ... 45
            System.out.print(i + " "); // println would print each number in the new line
        }
      // for(initialization; condition; iteration) {

        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        // 100 99 98 97 ... 50

        for(int i = 100; i >= 50; i--){ // i: 100 99 98 ... 50
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        //Print all even numbers between 1 ~ 55

        for(int i = 1; i <= 50; i++){

            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("----------------------------------------------------------------------");

        // Print all even numbers between 1 ~ 55: 2 4 6 8 ... 54

        for(int i = 2; i <= 54; i += 2) { // i: 2 4 6 8 10 ... 54

            System.out.print(i + " ");
        }
    }

}
