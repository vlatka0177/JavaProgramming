package InterviewQuestions;

public class IdentifyOddAndEven {

    public static void main(String[] args) {

        identify(6);
    }

    public static void identify(int num) {

        if(num % 2 == 0) {
            System.out.println("EVen");
        }else{
            System.out.println("Odd");
        }
    }
}
