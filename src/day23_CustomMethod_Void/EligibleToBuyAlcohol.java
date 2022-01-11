package day23_CustomMethod_Void;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        eligibleToBuyAlcohol(56);

    }

    public static void eligibleToBuyAlcohol(int age){

        if(age >= 18){
            System.out.println("Eligible to buy alcohol.");
        }else{
            System.out.println("Not eligible to buy alcohol.");
        }
    }


}

