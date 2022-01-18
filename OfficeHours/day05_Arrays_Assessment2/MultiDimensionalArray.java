package OfficeHours.day05_Arrays_Assessment2;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"Nina", "Tom", "Alex", "Trevor"};

        String[] scrum2 = {"Tony", "Silvana"};

        String[] scrum3 = {"Ana", "Caroline", "David"};

        String[][] scrumTeams = {{"Nina", "Tom", "Alex", "Trevor"}, {"Tony", "Silvana"}, {"Ana", "Caroline", "David"}};

        System.out.println(Arrays.deepToString(scrumTeams)); // deepToString
        // [[Nina, Tom, Alex, Trevor], [Tony, Silvana], [Ana, Caroline, David]]

        System.out.println(scrumTeams[1][1]); // Silvana

        for (String[] eachScrum : scrumTeams) {
            System.out.println(Arrays.toString(eachScrum));
        }  /* [Nina, Tom, Alex, Trevor]
              [Tony, Silvana]
              [Ana, Caroline, David] */

    }
}
