package day08_IfStatement;

public class Test01Variables {

    public static void main(String[] args) {

        /*
        Arithmetic Operators
        integer / integer ====> integer  10/3 or (int) (10.0/3.0) ===> 3
        decimal / integer ====> decimal  10.0/3 ====> 3.3333333333333335
        integer / decimal ====> decimal  10/3.0 ====> 3.3333333333333335
        decimal / decimal ====> decimal  10.0/3.0 ==> 3.3333333333333335
        */

        System.out.println(10/3); // 3
        System.out.println(10/3.0); // 3.3333333333333335
        System.out.println( (int) (10/3.0)); // 3

        /*
        Concatenation
         */

        System.out.println("5 + 2 = " + 3 + 4); // 5 + 2 = 3 + 4
        System.out.println("5 + 2 = " + (3 + 4)); // 5 + 2 = 7

        System.out.println("Result A" + 0 + 1); // Result A01
        System.out.println("Result B" + 1 + 2); // Result B12

        /* Primitive Type Casting
        Implicit: smaller primitive types are cast to the larger primitive types automatically.
        double > float > long > int > short > byte
         */

        byte b = 100;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        int ivar = 100;
        double dvar = 123;
        float fvar = 200;
        // ivar = fvar; does not compute
        fvar = ivar;
        dvar = fvar;
        // fvar = dvar; does not compute
        dvar = ivar;
        // ivar = dvar; does not compute









    }
}
