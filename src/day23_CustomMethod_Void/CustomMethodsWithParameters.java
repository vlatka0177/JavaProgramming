package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        // oddOrEven(); Compile error. The method demands additional information to complete its task.

        oddOrEven(10);

        ageOfPerson(1965);

        printNumbers(1000, 2000);

    }

    // Create A function that can check if A number is an odd number or an even number.

    public static void oddOrEven(int number){  //10

        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

    // Create A function that can display the age of A person.

    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);
    }
     //                                                        10    50
    // Create A function that can print all the numbers between X and Y.

    public static void printNumbers(int x, int y){


    }

}
