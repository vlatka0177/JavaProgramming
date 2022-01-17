package Assessments.Assessment2_day04OfficeHours;

public class Q10 {

    public static void main(String[] args) {

        String v = "today I will go to the beach";
        boolean d = v.contains("i");  // true
        boolean e = v.substring(12).startsWith("go");  // false


        String result2 = d && e ? "go" : "don't go";
        System.out.println(result2);  // don't go

    }
}
