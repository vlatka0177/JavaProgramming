package Assessments.Assessment3;

public class Q11 {

    public static boolean method5(String str) {

        boolean check = true;

        if(str.isEmpty()) {
            check = false;
        }

        if(!str.contains("A")) {
            check = false;
        }else if (str.contains("z")) {
            check = false;
        }
        check = str.substring(0, 1).equals("A") ? check : false;

        return check; // boolean check = true, so the answer is true
    }

    public static void main(String[] args) {

        System.out.println(method5("apple")); // true
    }
}
