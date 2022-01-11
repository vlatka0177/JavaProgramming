package day03_EscapeSequences; //it's Package name of the class

public class Println_VS_Print2 {

  public static void main(String[] args) { //main method

    System.out.println("Knock Knock"); //first it prints knock knock, then it appends a new line
    System.out.println("Who is this?");
    System.out.println("This is Java");

    System.out.println("--------------");

    System.out.print("Knock Knock"); //prints Knock Knock, does not appeand new line
    System.out.print("Who is this?");
    System.out.print("This is Java");

    System.out.println();
    System.out.println("-----------------");

    System.out.println("Hello everyone! How are you? We will learn Escape Sequences today. Tomorrow, we will learn Variables.");

    System.out.println("------------------");

    System.out.println("Hello everyone!");
    System.out.println("How are you?");
    System.out.println("We will learn Escape Sequences today.");
    System.out.println("Tomorrow, we will learn Variables.");


  }

}
