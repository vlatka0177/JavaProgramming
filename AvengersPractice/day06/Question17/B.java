package AvengersPractice.day06.Question17;

public class B {

    static int count;

    public B() {
        count++;
    }

    public B(int i) {
       count += i;
    }

    public void B(String s) {
        count += s.length();
    }
}
