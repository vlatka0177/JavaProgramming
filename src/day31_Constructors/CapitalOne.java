package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Mirjana Tupajic", 734985830);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(600);
        account1.checkBalance();

        System.out.println("---------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Goran Lazic", 749826903);

        System.out.println(account2);

        account2.deposit(1500);
        account2.checkBalance();

        account2.withdraw(700);
        account2.checkBalance();
    }
}
