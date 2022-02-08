package InterviewQuestions;

public class DivideWithoutDivisionOperator {

    public static void method1(int num1, int num2) {

        int count = 0; // 1 + 1 + 1 = 3 times,

        while(num1 >= num2) { // 1 < 3
            num1 -= num2; // 10 -3 = 7, num1 = 7, 7 - 3 = 4, num1 = 4, 4 - 3 = 1, num1 = 1
            count++; // increase the count by 1
        }
        System.out.println(count + " with a remainder of " + num1);
    }

    public static void main(String[] args) {

        method1(10,3); // 3 with a remainder of 1
    }
}
