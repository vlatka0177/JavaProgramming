package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveName_RemoveValues {

        public static void main(String[] args) {
            System.out.println(removeName(new ArrayList<>(Arrays.asList("Adam","John","Sam","Mirna")),"john"));
            System.out.println(removeValues(new ArrayList<>(Arrays.asList(100,15,700,2,500,50,60,8))));
        }

        public static ArrayList<String> removeName(ArrayList<String>arr, String name){
            arr.removeIf(p-> p.equalsIgnoreCase(name));
            return arr;
        }

        public static ArrayList<Integer> removeValues(ArrayList<Integer>arr){
            arr.removeIf(p-> p>100);
            return arr;
        }

    }
