package InterviewQuestions;

public class Divisibility {

    public static void main(String[] args) {

        String result1 = "";
        String result2 = "";
        String result3 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 15 != 0) {
                result1 += i + " ";
            } else if (i % 5 == 0 && i % 15 != 0) {
                result2 += i + " ";
            } else if (i % 15 == 0) {
                result3 += i + " ";
            }
        }
        System.out.println("Divisible by 3: " + result1);
        System.out.println("Divisible by 5: " + result2);
        System.out.println("Divisible by 15: " + result3);
    }
}