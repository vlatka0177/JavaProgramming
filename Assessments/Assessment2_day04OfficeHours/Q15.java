package Assessments.Assessment2_day04OfficeHours;

public class Q15 {

    public static void main(String[] args) {

        String str = "The whole time it was raining";

        do {

          System.out.print(str.charAt(0));  // T o miw in StringIndexOutOfBoundsException
            str = str.substring(3);

        }while(!str.isEmpty());

        /*
        str = " whole time it was raining.";
        str = "ole time it was raining.";
        str = " time it was raining.";
        str = "me it was raining.";
        str = "it was raining.";
        str = "was raining.";
        str = " raining.";
        str = "ining.";
        str = "ng.";
        */
    }
}
