package Assessments.Assessment2_day04OfficeHours;

public class Q7 {

    public static void main(String[] args) {

        //  Index    01234567891011121314151617
        String str = "the fox ran under the bridge";

        str = str.substring(4, 17);  // Ending index of substring, 17, is not included.
        str.toUpperCase(); // Doesn't do anything because str.toUpperCase() is not assigned to str
        // str = str.toUpperCase();  // FOX RAN UNDERground

        System.out.println(str + "ground");  // fox ran underground

    }
}
