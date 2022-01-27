package AvengersPractice.day06;

public class Question3 {

    int count; // Default of integer is 0

    public void m() {

        count++;
    }

    public void m(int n) {

        count *= n;
    }

    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.m(5); // count = 0 * 5 = 0
        obj.m();     // count = count + 1 = 1
        obj.count += 10; // count = 1 + 10 = 11
        obj.m(2); // count = 11 * 2 = 22
        System.out.print(obj.count); // 22

    }

}
