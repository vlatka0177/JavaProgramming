package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double PI = 3.14; // No need to print it because it is known and constant.
        int radius = 10;
        double diameter = radius * 2; // 10 * 2
        double area = radius * radius * PI; // 10 * 10 * 3.14
        double perimeter = diameter * PI; // 10 * 2 * 3.14

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
    /*
    3. Create A class named Circle, write A program that can calculate the area & perimeter of any given circle.
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI

    */