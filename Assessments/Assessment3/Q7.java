package Assessments.Assessment3;

public class Q7 {

        public static void main(String[] args) {

            method1(); // -120

            method2(); // 5
        }

        public static void method1(){

            int n = -5;

            for(int i = 1; i < 5; i++) {
                n *= i; // n = n * i
            }          // -5 * 1 = -5
                       // -5 * 2 = -10
                       //-10 * 3 = -30
                       //-30 * 4 = -120
            System.out.println(n);
        }

    public static void method2(){

        int n = -5;

        for(int i = 1; i < 5; i++) {
            n += i; // n = n + i
        }           //-5 + 1 = -4
                    //-4 + 2 = -2
                    //-2 + 3 = 1
                    // 1 + 4 = 5
        System.out.println(n);
    }
}
