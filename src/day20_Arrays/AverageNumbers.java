package day20_Arrays;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        int sum = 0; // +10 +20 +30 +40 +50 +60

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageNumber = sum / numbers.length;

        System.out.println("Average number = " + averageNumber); // Average number = 35.0
    }
}
