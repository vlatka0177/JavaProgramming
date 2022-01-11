package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {

    public static void main(String[] args) {

        /*
        7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output: 2
        */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        // adding multiple elements at once by using bulk operation
        System.out.println(list);

        for (Integer each : list) {
            int frequency = 0;
            for (Integer element : list) {
                if (element == each) {
                    frequency++;
                }
            }

            if (frequency > 1) {
                System.out.println("First duplicated element = " + each);
                break;
            }
        }


    }
}

