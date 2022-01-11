package AvengersPractice.day01;

public class CastingPractices {

    public static void main(String[] args) {

        // double > float > long > int > short > byte

        // byte to short

        byte b = 10;
        short s = b;   // implicit casting, smaller to bigger

        // double to int

        double d = 1.35;
        int i = (int) d;   // explicit casting, bigger to smaller

        // long to int

        long l = 99999999999999L;
        int k = (int) l;   //  explicit casting
        System.out.println("k = " + k);

        double j = 12.12;

        float f = 12;

    }
}
