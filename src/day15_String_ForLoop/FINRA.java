package day15_String_ForLoop;

public class FINRA {

    public static void main(String[] args) {

        /*
        Interview Question
        2. Write A method which prints out the numbers from 1 to 100.
        For numbers which are A multiple of both 3 and 5, print "FINRA" instead of the number.
        For numbers which are A multiple of 3, print "FIN" instead of the number.
        For numbers which are A multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
         */

        for(int i = 1; i <= 100; i++){ // i: 1 2 3 4 ... 100

            if(i % 15 == 0) { // 15 30 45 60 75 90
                System.out.print("FINRA "); // divisible by 3 and 5
            }else if(i % 3 == 0) { // 3 6 9 12 ... 99
                System.out.print("FIN "); // divisible by 3
            }else if(i % 5 == 0){ // 5 10 15 20 ... 100
                System.out.print("RA "); // divisible by 5
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
