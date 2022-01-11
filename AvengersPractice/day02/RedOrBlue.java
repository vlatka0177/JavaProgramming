package AvengersPractice.day02;

import java.util.Scanner;

public class RedOrBlue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = input.next();

        String result = " ";

        if(word.startsWith("red")){
            result = "\"red\"";
        }else if(word.startsWith("blue")){
            result = "\"blue\"";
        }else{
            result = "\"\"";
        }

        System.out.println("result = " + result);

    }

}
