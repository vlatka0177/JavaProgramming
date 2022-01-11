package day06_PrimitiveTypeCastings;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

    /* Implicit Casting
       Compiler automatically casts smaller primitive type to the larger primitive type.
       double > float > long > int > short > byte   */

        byte a = 100;
        short b = a;
        /*
        short b = (short)a;
                   (short)a               */

        int c = b; // implicit casting
        /* int c = (int)b
           () is a casting operator.
           Implicit when smaller primitives are cast to larger.
           Has to be written manually when larger primitives are cast into smaller.
        */

        long d = c;
        /*       (long)c

        Explicit Casting
        Larger primitives can not be directly assigned to the smaller primitives.
        Casting has to be done manually. */

        float e = d;
        double f = e;

        System.out.println("-------------------------------");

        int x = 55;
        short y = (short)x; //explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n; // 10

        System.out.println(n + " : " + s);

        System.out.println("-------------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;
        /* Shortcut: mouse after ; hold option and then press enter, select 'cast to short' from
        the drop-down menu. */

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long)f1; // Shortcut: after ; -> option -> enter -> 'cast to long'

    }
}
