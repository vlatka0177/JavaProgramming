package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        /*
        Do While Loop - "Just do it."
        First executes do block, and then executes the condition.
        Used when the body must be executed before checking the condition.

        do{
        statement(s)
        while condition
         */

        boolean a = false;

        for(int i = 0; a;){
            System.out.println("Wooden Spoon -- for loop");
        }

        System.out.println("-------------------------------------------");

        while(a){
            System.out.println("Wpodem Spoon -- while loop");
        }

        System.out.println("----------------------------");

        do {
            System.out.println("Wooden Spoon -- do-while loop");
        }while(a);

    }
}
