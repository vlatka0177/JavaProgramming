package day13_String;

public class CodilityTestPractice {

    public static void main(String[] args) {

     /*
     Write a function that gives a positive integer N
     Any number divisible by 2, 3 or 5 should be replaced by the word
				    	 Codility -- 2
                         Test     -- 3
                         Coders   -- 5
     If a number is divisible by more than one of the numbers, it should be
     replaced by a concatenation of the respective words Codility,
     Test and Coders in this given order.
	 EXPECTED
     Numbers divisible by both 2 and 3 should be replaced by CodilityTest
	 INPUT : 6    OUTPUT :  CodilityTest
     Numbers divisible by 3 and 5, should be replaced by TestCoders.
	 INPUT : 15    OUTPUT :  TestCoders
     */

        int num = 90;
        String result = " ";

        if (num % 2 == 0) {
            result += "Codility"; // Codility
        }

        if (num % 3 == 0) {
            result += "Test"; // CodilityTest
        }

        if(num % 5 == 0) {
            result += "Coders"; // CodilityTestCoders
        }

        System.out.println("result = " + result); // CodilityTestCoders

    }
}
