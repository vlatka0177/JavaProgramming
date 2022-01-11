package OfficeHours.day06_CustomMethods;

import java.util.ArrayList;

public class HidePassword {

    public static void main(String[] args) {

       /*
        Given an array of passwords (String), hide each password as a star (*) and show the hidden

        Input: {"one, "hi", "hold"}
        Output: [ ***, **, **** ]                                                                */

        String[] password = {"one", "hi", "hold"}; // String password array
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String each : password) {
            // hiddenPassword.add(each); //Before static() is created: hiddenPassword arrayList adding each of string
            hiddenPassword.add(convertToStar(each)); // After static() is created: add convertToStar
        }
        System.out.println(hiddenPassword); // Before convertToStar is added prints [one, hi, hold]
                                            // [***, **, ****]
    }

    public static String convertToStar(String str) {
        String star = "";
        for(int i = 0; i < str.length(); i++) {
            star += "*";
        }
        return star;
    }
}
