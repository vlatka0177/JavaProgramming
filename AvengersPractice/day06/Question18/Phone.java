package AvengersPractice.day06.Question18;

public class Phone {

    static int number;

    public Phone(String str) {
        this(str.length());
    }

    public Phone(int num) {
        this();
        number += num;
    }

    public Phone() {
        number += 1;
    }
}
