package OfficeHours.day05_ArraysAssessment2;

import java.util.Arrays;

public class MultipleWords {

    public static void main(String[] args) {

        /*
         Task :  Write a program that accepts string and prints multiple words in the string

       "knife, wooden spoons, plates, wine opener, cups, forks, rubbish bin";

        Output : wooden spoons
                 wine opener
                 rubbish bin
         */

        String words = "knife, wooden spoons, plates, wine opener, cups, forks, rubbish bin";

                String [] splitArr = words.split(", ");

        System.out.println(Arrays.toString(splitArr));

        for (String eachWord : splitArr) {
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }
    }
}
