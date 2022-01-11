package AvengersPractice.day04;

public class NumberOfActionsToEqualizeZerosAndOnesInAnArray {

    /*
    Given an array [1,1,1,0,1,0], how many actions are required to even the number of 0s and 1s.
    Expected output: 1                                                                     */

    public static void main(String[] args) {

        int [] array = {1, 1, 1, 0, 1, 0};
        int countZeros = 0;
        int countOnes = 0;
        int actions;

        for(int i : array) {
            if (i == 1) {
                countOnes++;
            }else {
                countZeros++;
            }
            }
        System.out.println("countOnes = " + countOnes);
        System.out.println("countZeros = " + countZeros);

        if(countOnes < countZeros) {
            actions = (countZeros - countOnes) / 2;
        }else {
            actions = (countOnes - countZeros) / 2; // (4 - 2) / 2 = 1 action to equalize zeros with ones

            if(countOnes < countZeros) {
                actions = (countZeros - countOnes) / 2;
            } else {
                actions = (countOnes - countZeros) / 2;
            }
            System.out.println("Number of actions required to equalize 0s and 1s = " + actions);
        }
    }
}
