package day11_Switch_Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        /* 2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
         */

        double salary = 75000.00;
        double taxRate = 0;
        boolean isMarried = true;

        if(salary >= 130000) {// false: salary < 130000
            taxRate = 0.35;
            }else if(salary >= 100000){
                taxRate = 0.3;
            }else if(salary >= 80000){
                taxRate = 0.25;
            }else if(salary <= 79000){
                taxRate = 0.2;

                if(isMarried) {
                    taxRate -= 0.05; // subtracting 5% from the tax rate
                    // taxRate = taxRate - 0.05;
                }
                double salaryAfterTax = salary - (salary * taxRate);

            System.out.println("salaryAfterTax = " + salaryAfterTax);

            }

        }
    }

