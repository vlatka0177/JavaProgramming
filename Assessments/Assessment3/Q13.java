package Assessments.Assessment3;

public class Q13 {

    public static void main(String[] args) {

        String str = method7("on the weekend", 20);
        System.out.println(str); // end
    }

    public static String method7(String str, int s) {
                        //               01234567
        str = str.substring(6); // str = _weekend
        if (s < 10) {           // s = 20
            str = str.substring(8);
        } else {
            if (str.length() > s) {
                str = "weekday";
            } else if (s > 10 || s == -10) { // s > 10
                str = str.substring(5); //  str = end
            }
        }
        return str;
    }
}
