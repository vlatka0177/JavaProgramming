package Kahoot;

public class Loops_StringManipulations {

    public static void main(String[] args) {

        /*
        Q1
        Break is used for exiting the loop and switch statements.

        Q2
        Continue is used for skipping the current iteration of the loop.  */

        // Q3

        for (char ch = 'A'; ch <= 'D'; ch++) {
            if (ch == 'C') {
                continue;
            }
            System.out.print(ch + " "); // A B
            if (ch == 'B') {
                break;
            }
        }

        System.out.println();

        // Q4

        int x = 10;
        for(int j =0; j <= 5; j++) { // 0 1 2 3 4 5 (15)
            x += j; // x = x + j
        }
        System.out.println(x);  // 25

        /*
        Q5

        While loop checks the condition first before executing the loop.
        Do-while loop executes the loop and then checks the condition.

        Q6

        The continue statement can only be used in a loop.

        Q7
        */
        int n = 10;
        if(n < 10) {
            System.out.println("Too Short");
        }else{
            System.out.println(n++); // 10
        }

        int i = 1;
        if(i < 10) {
            System.out.println("Too Short"); // Too Short
        }else{
            System.out.println(i++);
        }

        /*
        int num = 1;
        if(num < 10) {
            System.out.println("Too Short");
            break; // Compile Error: break outside switch or loop
        }else{
            System.out.println(num++);
        }

        Q8 */

        for(int j = 5; j <= 15; j++) {
            System.out.print(j + " ");
        }

        System.out.println();

        for(int k = 5; k < 16; k++) {
            System.out.print(k + " ");
        }

        System.out.println();

        // Q9

        String str = "Java";
        String str2 = new String(str);
        int count = 10;

        do {
            count += 2;
        }while(str == str2);

        System.out.println(count); // 12

        // Q10

        for(int t = 0; t <= 5; t++){
            if(t + 2 > 5){ // (4 + 2) > 5
                continue;
            }
            System.out.print(t + " "); // 0 1 2 3
        }




    }

}
