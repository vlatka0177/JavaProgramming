package Assessments.Assessment3;

public class Q9 {

    public static void main(String[] args) {

        method3(50); // No answer text provided.

    }

    public static String method3(int num) {

        if(num < 0) {
            return "Less than 0";
        }else if(num < 50) {
            return "Less than 50";
        }else if(num < 100) {
            return "Less than 100";
        }else{
            return "other";
        }
    }
}
