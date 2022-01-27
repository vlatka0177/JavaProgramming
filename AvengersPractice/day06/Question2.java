package AvengersPractice.day06;

public class Question2 {

    boolean canBounce;
    String color;

    public static void main(String[] args) {

        Question2 obj = new Question2();
        String color;
        color = "red";
        System.out.println(obj.color); // null; compiler is confused whether the input is an object or a string
        System.out.println(color); // red

    }

}
