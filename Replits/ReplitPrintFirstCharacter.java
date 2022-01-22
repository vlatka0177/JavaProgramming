package Replits;

import java.util.Scanner;

public class ReplitPrintFirstCharacter {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                String word = scan.next();

                String result = "";

                result += word.charAt(0);

                System.out.println(result);


            }
        }




