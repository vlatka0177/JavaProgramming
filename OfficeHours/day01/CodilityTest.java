package OfficeHours.day01;

public class CodilityTest {

    public static void main(String[] args) {

     /*
     Write A function that, given A positive integer, replaces any number divisible by 2, 3 or 5 by the following words:
				    	 Codility for numbers divisible by 2
                         Test for numbers divisible by 3
                         Coders for numbers divisible by 5
     If A number is divisible by more than one of the numbers 2, 3 or 5, it should be replaced by A
     concatenation of the words Codility, Test and Coders.
     EXPECTED
     INPUT : 6     OUTPUT :  CodilityTest
	 INPUT : 15    OUTPUT :  TestCoders
     */

        int number = 45;
        String result = "";

        if (number % 2 == 0) {
            result += "Codility"; //result="";
        }

        if(number % 3==0){
            result += "Test"; //result="Test";
        }

        if(number % 5==0){
            result += "Coders"; //result="Coders";
        }

        System.out.println("result = "+result);  //TestCoders

    }
}
