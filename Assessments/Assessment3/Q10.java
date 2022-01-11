package Assessments.Assessment3;

public class Q10 {

    public static void main(String[] args) {
        /*
        int result = method4("z", "zebra"); // Incompatible types: java.lang.String cannot be converted to char
        System.out.println("result");                                                                           */
    }

    public static int method4(char c, String s) {

        if(s.contains(" + c")) {
            return 1;
        }else {
            return 0;
        }
    }
}
