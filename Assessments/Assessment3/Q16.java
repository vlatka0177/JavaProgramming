package Assessments.Assessment3;

public class Q16 {

    public static void main(String[] args) {

        double number = add(3.4); // number = 2.5

        number += add("dual"); // number 12.5
        number += add(Integer.parseInt("100")); // Converts from string to integer; number = 17.5
        number += add(11341L); // implicitly double; 2.5 + 17.5 = 20; number = 20
        number += add(Float.parseFloat("50.8")); // Converts to float, and then implicitly double; number = 22.5

        System.out.println(number); // 22.5
    }

    public static int add(int n) {

        return 5;
    }

    public static double add(double d) {

        return 2.5;
    }

    public static long add(String s) {

        return 10;
    }
}
