package day24_CustomMethod_Return;

public class ReturnMethodsPractice2 {

    public static void main(String[] args) {

        /* Create A function that can calculate the grade.
           Check the grade
           'A' ==> Excellent
           'B' ==> Very Good
           'C' ==> Good
         */

        String str1 = grade(95);

        if(str1.equals("A")){
            System.out.println("Excellent");
        }else if(str1.equals("B")) {
            System.out.println("Very Good");
        }else if(str1.equals("C)")){
            System.out.println("Good");
        }else if(str1.equals("D")){
            System.out.println("Sufficient");
        }else{
            System.out.println("Try Again");
        }

    }

    public static String grade(int score){

        String result = " ";

        if(score < 0 || score > 100){
            result = "Invalid";
        }else{
            result = (score >= 90)? "A" :(score >= 80)? "B" :(score >= 70)? "C" :(score >= 60)? "D" : "F";
        }
        return result;
        // Void Method cannot return any value. Compile error.
        // Method needs to be String (Return Method). Allows us to assign the result to A variable to reuse it.
    }

}
