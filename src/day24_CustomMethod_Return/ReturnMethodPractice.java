package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // Find the maximum number between 100 and 200.

        int maxNumber = maximum(100, 200); // Assign it to the variable to make it reusable

        System.out.println(maxNumber);

        // Multiply the max number by 2.
        
        int multiplication = maxNumber * 2;

        System.out.println("multiplication = " + multiplication);

    }

    public static int maximum(int a, int b){

        int result = 0;

        if(a > b){
            result = a;
        }else{
            result = b;
        }

        return result;
    }


}
