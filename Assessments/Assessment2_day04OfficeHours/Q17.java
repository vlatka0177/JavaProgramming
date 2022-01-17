package Assessments.Assessment2_day04OfficeHours;

public class Q17 {

    public static void main(String[] args) {

        String str4 = "cybertek";
        /*
        for(int m = 0; m <= str4.length(); m += 2) {
            System.out.println(str4.charAt(m)); // cbre StringIndexOutOfBoundsException
        }
        */
        for(int m = 0; m <= str4.length()-1; m += 2) {
            System.out.print(str4.charAt(m)); // cbre
        }

        System.out.println();
    }
}
