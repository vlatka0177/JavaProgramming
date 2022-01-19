package AvengersPractice.day04;

public class SimpleMethodCreation {

    public static void main(String[] args) {
        
        int result1 = add(4,2); // Hover + More actions + Create method 'add' in Creating Methods
        System.out.println(result1); // 6

        int result2 = subtract(4,2);  // Hover + More actions + Create method 'subtract' in Creating Methods
        System.out.println(result2); // 2

        int result3 = multiply(4,2);  // Hover + More actions + Create method 'multiply' in Creating Methods
        System.out.println(result3); // 8

        int result4 = divide(4,2);  // Hover + More actions + Create method 'divide' in Creating Methods
        System.out.println(result4); // 2

    }

    private static int divide(int i, int i1) {

        return i / i1;
    }

    private static int multiply(int i, int i1) {

        return i * i1;
    }

    private static int subtract(int i, int i1) {

        return i - i1;
    }

    private static int add(int i, int i1) {

        return i + i1;
    }
}
