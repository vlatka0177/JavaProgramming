package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenateTwoArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatTwoArrays(new String[]{"I","like","to"},new String[]{"study","java"})));
    }

    public static String[] concatTwoArrays(String[]arr1,String[]arr2){
        String result="";
        for (String s1 : arr1) {
            result+=s1+" ";
        }
        for (String s2 : arr2) {
            result+=s2+" ";
        }
        String [] resultArr=result.split(" ");
        return resultArr;
    }
}
