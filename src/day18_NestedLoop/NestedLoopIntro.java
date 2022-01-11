package day18_NestedLoop;

public class NestedLoopIntro {

    /*
    Nested Loop
    - Loop inside another loop (inner & outer loops)
    - One iteration of the outer loop executes all iteration of the inner loop.
     */

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){ // Executes 5 times
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("-----------------------------------------------------------");

        for (int j = 0; j < 4; j++) { // Executes 4 times, j: 0, 1, 2, 3

            for (int i = 0; i < 5; i++) { // Executes 5 times, i: 0, 1, 2, 3, 4
                System.out.println("Wooden Spoon"); // 20 times Wooden Spoon
            }
        }
    }
}
