package Assessments.Assessment3;

public class Q16 {

    public static void main(String[] args) {

        double number = add(3.4);

        number += add("dual");
        number += add(Integer.parseInt("100")); // Converts from string to integer
        number += add(11341L); // implicitly double
        number += add(Float.parseFloat("50.8")); // Converts to float, and then implicitly double

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
