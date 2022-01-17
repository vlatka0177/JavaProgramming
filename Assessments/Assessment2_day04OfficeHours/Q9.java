package Assessments.Assessment2_day04OfficeHours;

public class Q9 {

    public static void main(String[] args) {

        //          0123456
        String p = "popcorn";
        // p = p.substring(1,8);  // StringIndexOutOfBoundsException

        p = p.substring(0, 3);  // "pop" Ending index does not get included.

        if (p.equals("opcor")) {
            System.out.println(p.length());
        } else {
            System.out.println(p.replace("o", "a"));  // pap
        }

        String r = "popcorn";
        r = r.substring(1, 6);  // "opcor" Ending index does not get included.

        if (r.equals("opcor")) {
            System.out.println(r.length());  // 5
        } else {
            System.out.println(r.replace("o", "a"));
        }

    }
}
