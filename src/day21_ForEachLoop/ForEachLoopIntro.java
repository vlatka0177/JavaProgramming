package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        /*
        For Each Loop
        - Iteration times and orders are fixed.
        - There must be a data structure (Array, Collection, Map) to use For Each Loop.
        - Used to access each successive value of a data structure, starting with the first element.
        - Does not have index numbers.

            |
            | ______________________
            |                       |
            V            True       |
        Elements in the ------> Statements
        data structure?
            |
            V   False
          Stop

          Syntax

          for(dataType variableName : dataStructure){
          Statement
          }

          for(dataType each : Array){
          }

          Data type must match with the successive values of the data structure

          int[] numbers = {3, 6, 9};
          for(int each : numbers){
          System.out.println(each);
          }

          Elements are int. Call the variable, and elements will be returned.
          Loop is executed as many times as there are elements in the data structure.
          Then, it will stop by itself.
          Here, executed 3 times because there are 3 elements in the array. Then, it stops.
          */

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
         //   index:      0   1   2   3   4   5   6

            for(int i = 0; i < numbers.length; i++){ // i: indexes of the array
                int eachElement = numbers[i];
                System.out.println(eachElement); // 10 20 30 40 50 60 70
            }

        System.out.println("---------------------------------------------------------------");

            for(int each : numbers) { // each: elements of the array
                System.out.println(each); // // 10 20 30 40 50 60 70
            }

            /*
            For Each Loop and For Loop Shortcuts
            variable.for enter     numbers.for

            Three options are given:
            1. For Each Loop
               for (int number : numbers) {
               }

            2. For Loop
               for (int i = 0; i < numbers.length; i++) {
               }

            3. For Loop
               for (int i = numbers.length - 1; i >= 0; i--) {
               }
             */

    }
}
