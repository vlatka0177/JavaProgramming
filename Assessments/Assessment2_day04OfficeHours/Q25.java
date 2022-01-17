package Assessments.Assessment2_day04OfficeHours;

public class Q25 {

    public static void main(String[] args) {

        String [] str = {"display","population","meeting","copy","franchise"};
                //  Index   0          1           2        3        4
        int a = str.length;
        int b = str[5].length(); // There is no index 5

        System.out.println(a + " " + b);  // ArrayIndexOutOfBoundsException. Index 5 out of bounds for length 5.


    }
}
