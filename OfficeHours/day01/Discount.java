package OfficeHours.day01;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        /*
        A shop will give 10% discount on purchases over $1000. Unit price is $100.
	    Use Scanner Class for quantity variable.
		INPUT for quantity :  5      EXPECTED : No discount applied
		INPUT for quantity :  15	 EXPECTED : You get a discount of $150 and your total is $1350																			   your total cost is $totalCost
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quantity");
        int quantity= input.nextInt();

        double unitPrice = 100;
        double totalCost = quantity * unitPrice;
        double discountRate = 0.1;  // 10/100=0.10
        double totalDiscount;

        if(totalCost >= 1000){
            totalDiscount = discountRate * totalCost;

            System.out.println("You get a discount of $" + totalDiscount + " and your total is $" +
                    (totalCost - totalDiscount));
        }else{
            System.out.println("No discount applied.");
        }

    }
}
