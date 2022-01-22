package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

         /*
        Wrapper Class Methods

        1. parse method
           - converts String into primitives

           String "1234567"  =======> integer

        2. valueOf method
           - converts wrapper class into A primitive
         */

        String str = "1234";

        int num = Integer.parseInt(str);  // Returns Integer value, so it can be assigned to A primitive int

        System.out.println(num + 1); // 1234 + 1 = 1235
        System.out.println(str + 1); // 12341

        System.out.println("----------------------------------------------------------------------");

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1); // 11.5 - double

        System.out.println("----------------------------------------------------------------------");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max); // max = 2147483647
        System.out.println("min = " + min); // min = -2147483648

        System.out.println("----------------------------------------------------------------------");

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2); // max2 = 9223372036854775807
        System.out.println("min2 = " + min2); // min2 = -9223372036854775808

        System.out.println("----------------------------------------------------------------------");

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1); // true

        String s2 = "maybe";
        boolean r2 = Boolean.parseBoolean(s2);
        System.out.println(r2); // false

        System.out.println("----------------------------------------------------------------------");

        String s3 = "123";
        Integer x = Integer.valueOf(s3); // 123 - Integer
        int y = Integer.valueOf(s3); // 123

        System.out.println(x);
        System.out.println(y);

        System.out.println("----------------------------------------------------------------------");

        String s4 = "1.5";
        Double z = Double.valueOf(s4); // 1.5 - Double
        System.out.println(z);

        System.out.println("----------------------------------------------------------------------");

        char ch1 = '0';
        boolean r3 = Character.isDigit(ch1); // true
        boolean r4 = Character.isLetter(ch1); // false

        System.out.println(r3);
        System.out.println(r4);

        System.out.println("----------------------------------------------------------------------");

        char ch2 = '!';
        boolean r5 = !Character.isLetterOrDigit(ch2);
        System.out.println(r5); // true

        System.out.println("----------------------------------------------------------------------");

        char ch3 = 'A';
        boolean r6 = Character.isUpperCase(ch3);
        boolean r7 = Character.isLowerCase(ch3);

        System.out.println(r6);  // true
        System.out.println(r7); // false

        System.out.println("---------------------------------------------------------------------");

        String s = "ab1cde2efg3hi4";
        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum); // sum = 10

    }
}
