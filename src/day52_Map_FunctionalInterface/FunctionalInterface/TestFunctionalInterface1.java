package day52_Map_FunctionalInterface.FunctionalInterface;

public class TestFunctionalInterface1 {

    public static void main(String[] args) {

        // Function 1. Create a function that can display a number is odd or even.
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if(n % 2 == 0) {
                System.out.println(n + " is even number."); // 20 is even number.
            }else{
                System.out.println(n + " is odd number.");
            }
        };
        oddOrEvenNumber.apply(20);

        // Function 2. Create a function that can check if a person is eligible to buy alcohol.
        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol = (age) -> {
            if(age >= 21) {
                System.out.println("Eligible to buy alcohol."); // Eligible to buy alcohol.
            }else{
                System.out.println("Not eligible to buy alcohol.");
            }
        };
        eligibleToBuyAlcohol.apply(32);

        // Function 3. Create a function that can display the cube of a number.
        MyFirstFunctionalInterface printCube;
        printCube = (n) -> System.out.println(n * n * n); // 27
        printCube.apply(3);

        // Function 4. Create a function that can check if a number is evenly divisible.
        MyFirstFunctionalInterface divisibleby3And5 = n -> {
            if(n % 15 == 0) {
                System.out.println(n + " is divisible by 3 and 5."); // 30 is divisible by 3 and 5.
            }else{
                System.out.println(n + " is not divisible by 3 and 5.");
            }
        };
        divisibleby3And5.apply(30);
    }
}
