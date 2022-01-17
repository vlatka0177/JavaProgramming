package Assessments.Assessment2_day04OfficeHours;

public class Q8 {

    public static void main(String[] args) {

        String z = "the game was tied at 2-2";
        String z2 = z.substring(5);  // z2 = "ame was tied at 2-2"

        int index1 = z.indexOf("game");  // int  index1 = 4
        int index2 = z2.indexOf("game");  // int index2 = -1

        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);  // -1
        }

    }
}
