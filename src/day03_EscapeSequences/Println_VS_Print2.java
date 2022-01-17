package day03_EscapeSequences; //it's Package name of the class

public class Println_VS_Print2 {

  public static void main(String[] args) { //main method

    System.out.println("Knock Knock"); // Prints Knock Knock. Then it appends a new line
    System.out.println("Who is this?");
    System.out.println("This is Java");

    System.out.println("--------------");

    System.out.print("Knock Knock"); //Prints Knock Knock. Does not append new line
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
